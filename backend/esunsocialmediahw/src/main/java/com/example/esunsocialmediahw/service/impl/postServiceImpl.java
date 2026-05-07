package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.*;
import com.example.esunsocialmediahw.repository.postRepository;
import com.example.esunsocialmediahw.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class postServiceImpl implements postService {

    @Autowired
    private postRepository postRepository;

    @Override
    public String createPost(postDTO post){
        postRepository.createPost(
            post.getUserId(),
            post.getContent(),
            post.getImage()
        );
        return "0000";
    }

    @Override
    public String updatePost(UpdatePostDTO updatePost){
        postRepository.updatePost(
                updatePost.getPostID(),
                updatePost.getUserID(),
                updatePost.getContent(),
                updatePost.getImage()
        );
        return "0000";
    }
    @Override
    public String deletePost(DeletePostDTO deletePost){
        postRepository.deletePost(
                deletePost.getPostID(),
                deletePost.getUserID()
        );
        return "0000";
    }
    @Override
    public List<PostDataDTO> showAllPost(){
        List<Object[]> rows = postRepository.showAllPost();

        List<PostDataDTO> allresult = new ArrayList<>();

        for (Object[] row : rows) {

            Long postID = ((Number) row[0]).longValue();
            Long userID = ((Number) row[1]).longValue();
            String userName = (String) row[2];
            String content = (String) row[3];
            LocalDateTime Created_At = (LocalDateTime) row[4];
            String Image = (String) row[5];

            allresult.add(new PostDataDTO(postID, userID, userName, content, Created_At, Image));
        }

        return allresult;
    }
    @Override
    public List<PostDataDTO> showUserPost(Long userIDforsearch){
        List<Object[]> rows = postRepository.showUserPost(userIDforsearch);

        List<PostDataDTO> userresult = new ArrayList<>();

        for (Object[] row : rows) {

            Long postID = ((Number) row[0]).longValue();
            Long userID = ((Number) row[1]).longValue();
            String userName = (String) row[2];
            String content = (String) row[3];
            LocalDateTime Created_At = (LocalDateTime) row[4];
            String Image = (String) row[5];

            userresult.add(new PostDataDTO(postID, userID, userName, content, Created_At, Image));
        }

        return userresult;
    }
}
