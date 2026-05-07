package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.loginDTO;
import com.example.esunsocialmediahw.dto.loginResponseDTO;
import com.example.esunsocialmediahw.entity.UserEntity;
import com.example.esunsocialmediahw.repository.loginRepository;
import com.example.esunsocialmediahw.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {
    @Autowired
    private loginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public loginResponseDTO UserLogin(loginDTO userLoginfrontend) {

        UserEntity user = loginRepository.User_Login(userLoginfrontend.getPhone());

        loginResponseDTO response = new loginResponseDTO();
        response.setUserID(user.getUserID());
        response.setUserName(user.getUserName());
        response.setEmail(user.getEmail());

        if (user == null){
            response.setStatus("4444");//帳號不存在
        }
        //比對密碼
        boolean passwordCheck = passwordEncoder.matches(
                userLoginfrontend.getPassword(),
                user.getPassword()
        );

        if (!passwordCheck){
            response.setStatus("1111");//密碼錯誤
        }
        response.setStatus("0000");//登入成功


        return response;
    }
}
