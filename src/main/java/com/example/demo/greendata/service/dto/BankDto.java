package com.example.demo.greendata.service.dto;

public class BankDto extends CommonDto {

    private String name;

    private String bik;

    public BankDto() {
    }

    public BankDto(String name, String bik) {
        this.name = name;
        this.bik = bik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBik() {
        return bik;
    }

    public void setBik(String bik) {
        this.bik = bik;
    }
}
