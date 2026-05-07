package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface loginRepository extends JpaRepository<UserEntity,Long> {
    @Query(value = "CALL user_login( :phone)", nativeQuery = true)
    UserEntity User_Login(
            @Param("phone") String phone
    );
}
