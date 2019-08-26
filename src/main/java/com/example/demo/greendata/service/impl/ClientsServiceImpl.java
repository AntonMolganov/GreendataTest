package com.example.demo.greendata.service.impl;

import com.example.demo.greendata.dao.entity.ClientEntity;
import com.example.demo.greendata.dao.repo.ClientsRepository;
import com.example.demo.greendata.dao.repo.CommonRepository;
import com.example.demo.greendata.service.ClientsService;
import com.example.demo.greendata.service.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ClientsServiceImpl
        extends CommonCRUDServiceImpl<ClientEntity, ClientDto>
        implements ClientsService {

    @Autowired
    ClientsRepository repository;

    @Override
    public CommonRepository<ClientEntity> getRepository() {
        return repository;
    }

    @Override
    public Class<ClientEntity> getEntityClass() {
        return ClientEntity.class;
    }

    @Override
    public Class<ClientDto> getDtoClass() {
        return ClientDto.class;
    }

    @Override
    public void fillEntity(ClientEntity entity, ClientDto dto) {
        if (dto.getName() != null) entity.setName(dto.getName());
        if (dto.getAddress() != null) entity.setAddress(dto.getAddress());
        if (dto.getOrganizational() != null) entity.setOrganizational(dto.getOrganizational());
        if (dto.getShortName() != null) entity.setShortName(dto.getShortName());
    }

}
