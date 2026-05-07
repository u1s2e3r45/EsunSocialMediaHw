package com.example.esunsocialmediahw.repository;

import com.example.esunsocialmediahw.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface postRepository extends JpaRepository<PostEntity, Long> {
    @Query(value = "CALL create_post(:userID, :Content, :Image)", nativeQuery = true)
    void createPost(
            @Param("userID") Long userID,
            @Param("Content") String Content,
            @Param("Image") String Image
    );
    @Query(value = "CALL update_post(:postID, :userID, :Content, :Image)", nativeQuery = true)
    void updatePost(
            @Param("postID") Long postID,
            @Param("userID") Long userID,
            @Param("Content") String Content,
            @Param("Image") String Image
    );
    @Query(value = "CALL delete_post(:postID, :userID)", nativeQuery = true)
    void deletePost(
            @Param("postID") Long postID,
            @Param("userID") Long userID
    );

    @Query(value = """
    select u.userName as post_user,
    p.Created_At,
    P.Content as post_content,
    p.Image,
    cu.userName as comment_user,
    cu.Content as comment_content,
    cu.Created_At
    from post as p
    inner join user as u
    on p.userID=u.uerID
    left join comment as c
    on p.postID=c.postID
    LEFT JOIN user cu 
    ON c.uerID = cu.uerID
    order by p.Created_At;
    """, nativeQuery = true)
    List<Object[]> showAllPost();

    @Query(value = """
    select u.userName as post_user,
    p.Created_At,
    P.Content as post_content,
    p.Image,
    cu.userName as comment_user,
    cu.Content as comment_content,
    cu.Created_At
    from post as p
    inner join user as u
    on p.userID=u.uerID
    left join comment as c
    on p.postID=c.postID
    LEFT JOIN user cu\s
    ON c.uerID = cu.uerID
    where p.userid = sup_userID
    order by p.Created_At;
    """, nativeQuery = true)
    List<Object[]> showUserPost(@Param("userID") Long userID);
}
