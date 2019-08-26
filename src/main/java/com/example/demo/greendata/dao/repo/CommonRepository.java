package com.example.demo.greendata.dao.repo;

import com.example.demo.greendata.dao.entity.CommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonRepository<Entity extends CommonEntity> extends JpaRepository<Entity, Integer> {
}
