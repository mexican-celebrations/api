package com.mexicancelebrations.api.controller;

import com.mexicancelebrations.api.domain.entity.LoginResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
    @GetMapping
    public LoginResponse n(@RequestParam String userId){
        LoginResponse f= new LoginResponse();
        f.setToken("Hola mundo");
        f.setTimestamp(new Date());
        f.setUserId(userId);
        return f;
    }
}
