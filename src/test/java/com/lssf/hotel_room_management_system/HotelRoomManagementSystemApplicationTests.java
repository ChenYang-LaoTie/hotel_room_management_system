package com.lssf.hotel_room_management_system;

import com.lssf.hotel_room_management_system.modules.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HotelRoomManagementSystemApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
    }


    @Test
    void findAllUser() {
        System.out.println(userMapper.selectAll());
    }
}
