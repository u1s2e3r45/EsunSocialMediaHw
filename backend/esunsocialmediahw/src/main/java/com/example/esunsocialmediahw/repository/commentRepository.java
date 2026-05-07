package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.CommentEntity;
import com.example.esunsocialmediahw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface commentRepository extends JpaRepository<CommentEntity, Long> {
    @Query(value = "CALL create_comment(:userID, :postID, :Content)", nativeQuery = true)
    CommentEntity createComment(
            @Param("userID") Long userID,
            @Param("postID") Long postID,
            @Param("Content") String Content
    );
}
