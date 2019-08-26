package com.example.demo.greendata.dao.entity;

import javax.persistence.*;

@Entity
@Table (schema = "greendata", name = "dic_organizational")
public class OrganizationalEntity extends CommonEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
