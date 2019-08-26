package com.example.demo.greendata.dao.entity;

import javax.persistence.*;

@Entity
@Table (schema = "greendata", name = "banks")
public class BankEntity extends CommonEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "bik")
    private String bik;

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
