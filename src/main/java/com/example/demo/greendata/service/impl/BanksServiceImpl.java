package com.example.demo.greendata.service.impl;

import com.example.demo.greendata.dao.entity.BankEntity;
import com.example.demo.greendata.dao.repo.BanksRepository;
import com.example.demo.greendata.dao.repo.CommonRepository;
import com.example.demo.greendata.service.BanksService;
import com.example.demo.greendata.service.dto.BankDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BanksServiceImpl
        extends CommonCRUDServiceImpl<BankEntity, BankDto>
        implements BanksService {

    @Autowired
    BanksRepository repository;

    @Override
    public CommonRepository<BankEntity> getRepository() {
        return repository;
    }

    @Override
    public Class<BankEntity> getEntityClass() {
        return BankEntity.class;
    }

    @Override
    public Class<BankDto> getDtoClass() {
        return BankDto.class;
    }

    @Override
    public void fillEntity(BankEntity entity, BankDto dto) {
        if (dto.getName() != null) entity.setName(dto.getName());
        if (dto.getBik() != null) entity.setBik(dto.getBik());
    }

}
