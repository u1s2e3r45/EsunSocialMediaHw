package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface registerRepository extends JpaRepository<UserEntity, Long> {
    @Procedure(procedureName  = "create_user")
    Long createUser(
            @Param("userName") String userName,
            @Param("email") String email,
            @Param("phone") String phone,
            @Param("password") String password,
            @Param("CoverImage") String CoverImage,
            @Param("Biography") String Biography
    );

}
