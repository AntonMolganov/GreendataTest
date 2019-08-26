package com.example.demo.greendata.dao.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class CommonEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
