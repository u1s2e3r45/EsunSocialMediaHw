package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.loginDTO;
import com.example.esunsocialmediahw.dto.loginResponseDTO;
import com.example.esunsocialmediahw.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/", allowCredentials = "true")
@RestController
@RequestMapping("/loginController")
public class loginController {
    @Autowired
    private loginService loginService;

    @PostMapping("/login")
    public loginResponseDTO UserLogin(@RequestBody loginDTO user){

        return loginService.UserLogin(user);
    }

}
