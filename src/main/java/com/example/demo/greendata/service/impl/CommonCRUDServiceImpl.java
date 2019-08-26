package com.example.demo.greendata.service.impl;

import com.example.demo.greendata.dao.entity.CommonEntity;
import com.example.demo.greendata.dao.repo.CommonRepository;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.dto.CommonDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public abstract class CommonCRUDServiceImpl<Entity extends CommonEntity, Dto extends CommonDto>
        implements CommonCRUDService<Entity, Dto> {

    @Autowired
    ModelMapper modelMapper;

    public abstract CommonRepository<Entity> getRepository();

    public abstract Class<Entity> getEntityClass();

    public abstract Class<Dto> getDtoClass();

    public Dto create(Dto dto) {
        Entity entity = this.convertToEntity(dto, getEntityClass());
        entity = getRepository().save(entity);
        return convertToDto(entity, getDtoClass());
    }

    @Override
    public Dto read(Integer id) throws Exception {
        Optional<Entity> found = getRepository().findById(id);
        if (!found.isPresent()) throw new Exception("Object with specified id not found");

        return convertToDto(found.get(), getDtoClass());
    }

    @Override
    public Iterable<Dto> listAll(Dto dto, Sort sort) {
        if (dto == null && sort == null) return convertToDto(getRepository().findAll(), getDtoClass());

        if (dto == null) return convertToDto(getRepository().findAll(sort), getDtoClass());

        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Entity> example = Example.of(convertToEntity(dto, getEntityClass()), exampleMatcher);
        return convertToDto(getRepository().findAll(example, sort), getDtoClass());
    }

    @Override
    public Dto update(Integer id, Dto dto) throws Exception {
        Optional<Entity> found = getRepository().findById(id);
        if (!found.isPresent()) throw new Exception("Object with specified id not found");

        Entity entity = found.get();
        fillEntity(entity, dto);
        entity = getRepository().save(entity);

        return convertToDto(entity, getDtoClass());
    }

    public abstract void fillEntity(Entity entity, Dto dto);

    @Override
    public Dto delete(Integer id) throws Exception {
        Optional<Entity> found = getRepository().findById(id);
        if (!found.isPresent()) throw new Exception("Object with specified id not found");

        Entity entity = found.get();
        getRepository().delete(entity);

        return convertToDto(entity, getDtoClass());
    }

    public <Entity extends CommonEntity, Dto extends CommonDto> Dto convertToDto(Entity entity, Class<Dto> clazz) {
        return modelMapper.map(entity, clazz);
    }

    public <Entity extends CommonEntity, Dto extends CommonDto> Iterable<Dto> convertToDto(Iterable<Entity> collection, Class<Dto> clazz) {
        List<Dto> convertedList = new LinkedList<>();
        for (Entity entity : collection){
            convertedList.add(convertToDto(entity, clazz));
        }
        return convertedList;
    }

    public <Entity extends CommonEntity, Dto extends CommonDto> Entity convertToEntity(Dto dto, Class<Entity> clazz) {
        return modelMapper.map(dto, clazz);
    }

    public <Entity extends CommonEntity, Dto extends CommonDto> Iterable<Entity> convertToEntity(Iterable<Dto> collection, Class<Entity> clazz) {
        List<Entity> convertedList = new LinkedList<>();
        for (Dto dto : collection){
            convertedList.add(convertToEntity(dto, clazz));
        }
        return convertedList;
    }

}
