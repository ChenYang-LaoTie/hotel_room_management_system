package com.lssf.hotel_room_management_system.modules.user.controller;

import com.lssf.hotel_room_management_system.modules.user.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desciption: UserController
 * @Autor ChenYang
 * @Date 2020/10/6    10:02
 */

@RestController
@RequestMapping("/User")
public class UserController {

    @PostMapping("/userLogin")
    public Map<String, Object> userLogin(User user) {
        System.out.println(user);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("user", user);
        // TODO: 2020/10/6 userLogin 
        return hashMap;
    }

}
