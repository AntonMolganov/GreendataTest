package com.example.demo.greendata.controller;

import com.example.demo.greendata.dao.entity.ClientEntity;
import com.example.demo.greendata.service.ClientsService;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.dto.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clients")
public class ClientsController extends CommonCRUDController<ClientEntity, ClientDto> {

    @Autowired
    ClientsService service;

    @Override
    public CommonCRUDService<ClientEntity, ClientDto> getService() {
        return service;
    }
}
