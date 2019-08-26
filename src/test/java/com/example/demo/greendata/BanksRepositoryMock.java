package com.example.demo.greendata;

import com.example.demo.greendata.dao.entity.BankEntity;
import com.example.demo.greendata.dao.repo.BanksRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.*;

public class BanksRepositoryMock implements BanksRepository {

    private Integer id = 0;

    Map<Integer, BankEntity> storage = new HashMap<>();

    @Override
    public List<BankEntity> findAll() {
        return new LinkedList<BankEntity>(storage.values());
    }

    @Override
    public List<BankEntity> findAll(Sort sort) {
        return new LinkedList<BankEntity>(storage.values());
    }

    @Override
    public List<BankEntity> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public <S extends BankEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends BankEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<BankEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public BankEntity getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends BankEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends BankEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<BankEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public BankEntity save(BankEntity entity) {
        if (entity.getId() == null) entity.setId(++id);
        storage.put(entity.getId(), entity);
        return storage.get(entity.getId());
    }

    @Override
    public Optional<BankEntity> findById(Integer id) {
        return Optional.of(storage.get(id));
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(BankEntity entity) {
        storage.remove(entity.getId());
    }

    @Override
    public void deleteAll(Iterable<? extends BankEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends BankEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends BankEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends BankEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends BankEntity> boolean exists(Example<S> example) {
        return false;
    }
}
