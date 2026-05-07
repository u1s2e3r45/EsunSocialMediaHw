package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.loginDTO;
import com.example.esunsocialmediahw.dto.loginResponseDTO;
import com.example.esunsocialmediahw.service.loginService;
import org.springframework.web.bind.annotation.RequestBody;

public class loginController {
    private loginService loginService;

    public loginResponseDTO UserLogin(@RequestBody loginDTO user){
        loginResponseDTO response = new loginResponseDTO();
        response.setStatus(loginService.UserLogin(user));
        return response;
    }

}
