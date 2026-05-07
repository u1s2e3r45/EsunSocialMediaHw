package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface postRepository extends JpaRepository<PostEntity, Long> {
    @Modifying
    @Transactional
    @Query(value = "CALL create_post(:userID, :Content, :Image)", nativeQuery = true)
    void createPost(
            @Param("userID") Long userID,
            @Param("Content") String Content,
            @Param("Image") String Image
    );
    @Modifying
    @Transactional
    @Query(value = "CALL update_post(:postID, :userID, :Content, :Image)", nativeQuery = true)
    void updatePost(
            @Param("postID") Long postID,
            @Param("userID") Long userID,
            @Param("Content") String Content,
            @Param("Image") String Image
    );
    @Modifying
    @Transactional
    @Query(value = "CALL delete_post(:postID, :userID)", nativeQuery = true)
    void deletePost(
            @Param("postID") Long postID,
            @Param("userID") Long userID
    );

    @Query(value = """
    select p.postID,
    p.userID,
    u.userName,
    P.Content,
    p.Created_At,
    p.Image
    from post as p
    inner join user as u
    on p.userID=u.userID
    order by p.Created_At;
    """, nativeQuery = true)
    List<Object[]> showAllPost();

    @Query(value = """
    select p.postID,
    p.userID,
    u.userName,
    P.Content,
    p.Created_At,
    p.Image
    from post as p
    inner join user as u
    on p.userID=u.userID
    where p.userID = :userID
    order by p.Created_At;
    """, nativeQuery = true)
    List<Object[]> showUserPost(@Param("userID") Long userID);


}
