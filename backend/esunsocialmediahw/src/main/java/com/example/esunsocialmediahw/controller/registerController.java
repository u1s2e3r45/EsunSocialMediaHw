package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.registerDTO;
import com.example.esunsocialmediahw.service.registerService;
import org.springframework.web.bind.annotation.RequestBody;

public class registerController {
    private registerService registerService;

    public String register(@RequestBody registerDTO user) {

        registerService.register(user);

        return "成功註冊";
    }
}
