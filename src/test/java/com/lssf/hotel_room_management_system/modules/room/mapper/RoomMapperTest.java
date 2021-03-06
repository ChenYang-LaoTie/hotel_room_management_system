package com.lssf.hotel_room_management_system.modules.room.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class RoomMapperTest {

    @Autowired
    private RoomMapper roomMapper;

    @Test
    void getAllroom() {
        System.out.println(roomMapper.selectAll());
    }


}