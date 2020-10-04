package com.lssf.hotel_room_management_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan({"com.lssf.hotel_room_management_system.modules.user.mapper"})
public class HotelRoomManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelRoomManagementSystemApplication.class, args);
    }

}
