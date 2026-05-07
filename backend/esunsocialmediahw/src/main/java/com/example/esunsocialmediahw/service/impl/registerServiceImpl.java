package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.registerDTO;
import com.example.esunsocialmediahw.repository.registerRepository;
import com.example.esunsocialmediahw.service.registerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class registerServiceImpl implements registerService {
    @Autowired
    private registerRepository registerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(registerDTO user){
        // 加密（含 salt，BCrypt 內建）
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        registerRepository.createUser(
                user.getUserName(),
                user.getEmail(),
                user.getPhone(),
                hashedPassword,
                user.getCoverImage(),
                user.getBiography()
        );
    }
}
