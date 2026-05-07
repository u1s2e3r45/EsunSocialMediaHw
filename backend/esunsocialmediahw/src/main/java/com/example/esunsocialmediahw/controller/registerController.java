package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.ResponseDTO;
import com.example.esunsocialmediahw.dto.loginResponseDTO;
import com.example.esunsocialmediahw.dto.registerDTO;
import com.example.esunsocialmediahw.dto.registerResponseDTO;
import com.example.esunsocialmediahw.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/", allowCredentials = "true")
@RestController
@RequestMapping("/registerController")
public class registerController {

    @Autowired
    private registerService registerService;
    @PostMapping("/register")
    public registerResponseDTO register(@RequestBody registerDTO user) {
        return registerService.register(user);
    }
}
