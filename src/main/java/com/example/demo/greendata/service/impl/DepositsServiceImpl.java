package com.example.demo.greendata.service.impl;

import com.example.demo.greendata.dao.entity.DepositEntity;
import com.example.demo.greendata.dao.repo.CommonRepository;
import com.example.demo.greendata.dao.repo.DepositsRepository;
import com.example.demo.greendata.service.DepositsService;
import com.example.demo.greendata.service.dto.DepositDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DepositsServiceImpl
        extends CommonCRUDServiceImpl<DepositEntity, DepositDto>
        implements DepositsService {

    @Autowired
    DepositsRepository repository;

    @Override
    public CommonRepository<DepositEntity> getRepository() {
        return repository;
    }

    @Override
    public Class<DepositEntity> getEntityClass() {
        return DepositEntity.class;
    }

    @Override
    public Class<DepositDto> getDtoClass() {
        return DepositDto.class;
    }

    @Override
    public void fillEntity(DepositEntity entity, DepositDto dto) {
        if (dto.getClientId() != null) entity.setClientId(dto.getClientId());
        if (dto.getBankId() != null) entity.setBankId(dto.getBankId());
        if (dto.getOpenDate() != null) entity.setOpenDate(dto.getOpenDate());
        if (dto.getPercent() != null) entity.setPercent(dto.getPercent());
        if (dto.getTerm() != null) entity.setTerm(dto.getTerm());
    }

}
