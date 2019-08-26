package com.example.demo.greendata.service;

import com.example.demo.greendata.dao.entity.CommonEntity;
import com.example.demo.greendata.service.dto.CommonDto;
import org.springframework.data.domain.Sort;

public interface CommonCRUDService<Entity extends CommonEntity, Dto extends CommonDto> {

    Dto create(Dto dto);

    Dto read(Integer id) throws Exception;

    Iterable<Dto> listAll(Dto dto, Sort sort);

    Dto update(Integer id, Dto dto) throws Exception;

    Dto delete (Integer id) throws Exception;
}
