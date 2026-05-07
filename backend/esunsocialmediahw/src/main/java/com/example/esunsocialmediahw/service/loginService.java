package com.example.esunsocialmediahw.service;

import com.example.esunsocialmediahw.dto.loginDTO;
import com.example.esunsocialmediahw.dto.loginResponseDTO;

public interface loginService {
    loginResponseDTO UserLogin(loginDTO user);
}


