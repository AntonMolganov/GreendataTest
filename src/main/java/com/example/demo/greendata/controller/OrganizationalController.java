package com.example.demo.greendata.controller;

import com.example.demo.greendata.dao.entity.OrganizationalEntity;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.OrganizationalsService;
import com.example.demo.greendata.service.dto.OrganizationalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/organizational")
public class OrganizationalController extends CommonCRUDController<OrganizationalEntity, OrganizationalDto> {

    @Autowired
    OrganizationalsService service;

    @Override
    public CommonCRUDService<OrganizationalEntity, OrganizationalDto> getService() {
        return service;
    }
}
