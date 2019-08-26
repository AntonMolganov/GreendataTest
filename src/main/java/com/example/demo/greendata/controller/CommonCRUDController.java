package com.example.demo.greendata.controller;

import com.example.demo.greendata.dao.entity.CommonEntity;
import com.example.demo.greendata.service.CommonCRUDService;
import com.example.demo.greendata.service.dto.CommonDto;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


@RestController
public abstract class CommonCRUDController<Entity extends CommonEntity, Dto extends CommonDto> {


    public abstract CommonCRUDService<Entity, Dto> getService();

    @PostMapping("/new")
    public @ResponseBody
    Dto create(Dto dto) {
        return getService().create(dto);
    }

    @GetMapping("/{id}")
    public @ResponseBody Dto read(@PathVariable Integer id) throws Exception {
        return getService().read(id);
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<Dto> list(Dto filter, Sort sort) {
        return getService().listAll(filter, sort);
    }

    @PutMapping("/{id}")
    public @ResponseBody Dto update(@PathVariable Integer id, Dto dto) throws Exception {
        return getService().update(id, dto);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody Dto delete(@PathVariable Integer id) throws Exception {
        return getService().delete(id);
    }
}
