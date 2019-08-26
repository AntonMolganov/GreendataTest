package com.example.demo.greendata.service.impl;

import com.example.demo.greendata.dao.entity.OrganizationalEntity;
import com.example.demo.greendata.dao.repo.CommonRepository;
import com.example.demo.greendata.dao.repo.OrganizationalRepository;
import com.example.demo.greendata.service.OrganizationalsService;
import com.example.demo.greendata.service.dto.OrganizationalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrganizationalsServiceImpl
        extends CommonCRUDServiceImpl<OrganizationalEntity, OrganizationalDto>
        implements OrganizationalsService {

    @Autowired
    OrganizationalRepository repository;

    @Override
    public CommonRepository<OrganizationalEntity> getRepository() {
        return repository;
    }

    @Override
    public Class<OrganizationalEntity> getEntityClass() {
        return OrganizationalEntity.class;
    }

    @Override
    public Class<OrganizationalDto> getDtoClass() {
        return OrganizationalDto.class;
    }

    @Override
    public void fillEntity(OrganizationalEntity entity, OrganizationalDto dto) {
        if (dto.getName() != null) entity.setName(dto.getName());
    }
}
