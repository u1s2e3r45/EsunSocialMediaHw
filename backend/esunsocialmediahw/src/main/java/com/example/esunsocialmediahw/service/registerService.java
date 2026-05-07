package com.example.esunsocialmediahw.service;

import com.example.esunsocialmediahw.dto.registerDTO;
import com.example.esunsocialmediahw.dto.registerResponseDTO;

public interface registerService {
    registerResponseDTO register(registerDTO user);
}