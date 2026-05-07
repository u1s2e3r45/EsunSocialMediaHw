package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.CommentEntity;
import com.example.esunsocialmediahw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface commentRepository extends JpaRepository<CommentEntity, Long> {
    @Modifying
    @Transactional
    @Query(value = "CALL create_comment(:userID, :postID, :content)", nativeQuery = true)
    CommentEntity createComment(
            @Param("userID") Long userID,
            @Param("postID") Long postID,
            @Param("content") String content
    );

    @Query(value = """
    select c.content,
    c.Created_At,
    u.userName
    from comment as c
    inner join user as u
    on c.userID=u.userID
    WHERE postID = :postID
    order by c.Created_At;
    """, nativeQuery = true)
    List<Object[]> showAllCommentOfPost(Long postID);
}
