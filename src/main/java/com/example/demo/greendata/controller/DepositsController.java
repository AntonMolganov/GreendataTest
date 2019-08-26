package com.example.demo.greendata.controller;

import com.example.demo.greendata.dao.entity.DepositEntity;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.DepositsService;
import com.example.demo.greendata.service.dto.DepositDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/deposits")
public class DepositsController extends CommonCRUDController<DepositEntity, DepositDto> {

    @Autowired
    DepositsService depositsService;

    @Override
    public CommonCRUDService<DepositEntity, DepositDto> getService() {
        return depositsService;
    }
}
