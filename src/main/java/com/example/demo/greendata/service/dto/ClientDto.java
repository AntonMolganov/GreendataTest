package com.example.demo.greendata.service.dto;

public class ClientDto extends CommonDto {

    private String name;

    private String shortName;

    private String address;

    private Integer organizational;

    public ClientDto() {
    }

    public ClientDto(String name, String shortName, String address, Integer organizational) {
        this.name = name;
        this.shortName = shortName;
        this.address = address;
        this.organizational = organizational;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getOrganizational() {
        return organizational;
    }

    public void setOrganizational(Integer organizational) {
        this.organizational = organizational;
    }
}
