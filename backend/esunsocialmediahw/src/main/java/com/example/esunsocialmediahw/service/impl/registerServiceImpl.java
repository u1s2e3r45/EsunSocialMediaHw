package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.registerDTO;
import com.example.esunsocialmediahw.dto.registerResponseDTO;
import com.example.esunsocialmediahw.repository.registerRepository;
import com.example.esunsocialmediahw.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class registerServiceImpl implements registerService {
    @Autowired
    private registerRepository registerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public registerResponseDTO register(registerDTO user){
        // 加密（含 salt，BCrypt 內建）
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        Long out_userID = registerRepository.createUser(
                user.getUserName(),
                user.getEmail(),
                user.getPhone(),
                hashedPassword,
                user.getCoverImage(),
                user.getBiography()
        );

        registerResponseDTO response = new registerResponseDTO();
        response.setUserID(out_userID);
        response.setStatus("0000");
        return response;
    }
}
