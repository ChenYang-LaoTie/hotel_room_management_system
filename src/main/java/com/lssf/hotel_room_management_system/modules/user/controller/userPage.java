package com.lssf.hotel_room_management_system.modules.user.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userPage")
public class userPage {


    @GetMapping("/userLoginPage")
    public String userLoginPage() {
        return "user/userLogin";
    }

}
