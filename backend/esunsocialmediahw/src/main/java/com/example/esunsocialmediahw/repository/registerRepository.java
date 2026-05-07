package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface registerRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = "CALL create_user(:userName, :Email, :phone, :password, :CoverImage, :Biography)", nativeQuery = true)
    void createUser(
            @Param("userName") String userName,
            @Param("Email") String Email,
            @Param("phone") String phone,
            @Param("password") String password,
            @Param("CoverImage") String CoverImage,
            @Param("Biography") String Biography
    );

}
