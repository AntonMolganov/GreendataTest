package com.example.demo.greendata;

import com.example.demo.greendata.dao.repo.BanksRepository;
import com.example.demo.greendata.service.dto.BankDto;
import com.example.demo.greendata.service.impl.BanksServiceImpl;
import com.example.demo.greendata.service.impl.ModelMapperImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.core.annotation.Order;

import java.util.stream.StreamSupport;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BanksServiceImplTest {

    @Spy
    private BanksRepository banksRepository = new BanksRepositoryMock();

    @Spy
    private ModelMapper modelMapper = new ModelMapperImpl();

    @InjectMocks
    BanksServiceImpl banksService;


    @Test
    @Order(1)
    public void create(){
        BankDto dto = new BankDto("name", "bik");
        BankDto createdDto = banksService.create(dto);
        assertEquals(createdDto.getName(), dto.getName());
        assertEquals(createdDto.getBik(), dto.getBik());
    }

    @Test
    @Order(2)
    public void read() throws Exception {
        banksService.create(new BankDto("name", "bik"));
        BankDto dto = banksService.read(1);
        assertEquals(dto.getName(), "name");
        assertEquals(dto.getBik(), "bik");
    }

    @Test
    @Order(3)
    public void readAll() throws Exception {
        banksService.create(new BankDto("name", "bik"));
        banksService.create(new BankDto("name2", "bik2"));
        banksService.create(new BankDto("name3", "bik3"));
        Iterable<BankDto> iterable = banksService.listAll(null,null);
        assertEquals(StreamSupport.stream(iterable.spliterator(), false).count(), 3);
    }

    @Test
    @Order(4)
    public void update() throws Exception {
        BankDto dto = banksService.create(new BankDto("name", "bik"));
        dto.setName("name2");
        dto = banksService.update(dto.getId(), dto);
        assertEquals(dto.getName(), "name2");
    }

    @Test
    @Order(5)
    public void delete() throws Exception {
        BankDto dto = banksService.create(new BankDto("name", "bik"));
        Iterable<BankDto> iterable = banksService.listAll(null,null);
        assertEquals(StreamSupport.stream(iterable.spliterator(), false).count(), 1);

        dto = banksService.delete(dto.getId());
        iterable = banksService.listAll(null,null);
        assertEquals(StreamSupport.stream(iterable.spliterator(), false).count(), 0);
    }


}
