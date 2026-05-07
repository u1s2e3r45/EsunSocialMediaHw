package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.DeletePostDTO;
import com.example.esunsocialmediahw.dto.PostDataDTO;
import com.example.esunsocialmediahw.dto.UpdatePostDTO;
import com.example.esunsocialmediahw.dto.postDTO;
import com.example.esunsocialmediahw.repository.postRepository;
import com.example.esunsocialmediahw.service.postService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class postServiceImpl implements postService {

    @Autowired
    private postRepository postRepository;

    @Override
    public void createPost(postDTO post){
        postRepository.createPost(
            post.getUserId(),
            post.getContent(),
            post.getImage()
        );
    }

    @Override
    public void updatePost(UpdatePostDTO updatePost){
        postRepository.updatePost(
                updatePost.getPostID(),
                updatePost.getUserID(),
                updatePost.getContent(),
                updatePost.getImage()
        );
    }
    @Override
    public void deletePost(DeletePostDTO deletePost){
        postRepository.deletePost(
                deletePost.getPostID(),
                deletePost.getUserID()
        );
    }

    @Override
    public List<PostDataDTO> showAllPosts(){
        List<Object[]> posts = postRepository.showAllPost();
        
    }

}
