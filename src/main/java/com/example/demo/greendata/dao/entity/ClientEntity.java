package com.example.demo.greendata.dao.entity;

import javax.persistence.*;

@Entity
@Table (schema = "greendata", name = "clients")
public class ClientEntity extends CommonEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "shortname")
    private String shortName;


    @Column(name = "address")
    private String address;

    @Column(name = "organizational")
    private Integer organizational;

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
