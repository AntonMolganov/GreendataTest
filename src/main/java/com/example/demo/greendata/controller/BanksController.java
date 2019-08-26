package com.example.demo.greendata.controller;

import com.example.demo.greendata.dao.entity.BankEntity;
import com.example.demo.greendata.service.BanksService;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.dto.BankDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/banks")
public class BanksController extends CommonCRUDController<BankEntity, BankDto> {

    @Autowired
    BanksService service;

    @Override
    public CommonCRUDService<BankEntity, BankDto> getService() {
        return service;
    }
}
