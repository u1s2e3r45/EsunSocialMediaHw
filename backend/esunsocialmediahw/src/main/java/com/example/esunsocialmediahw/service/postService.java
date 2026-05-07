package com.example.esunsocialmediahw.service;

import com.example.esunsocialmediahw.dto.DeletePostDTO;
import com.example.esunsocialmediahw.dto.PostDataDTO;
import com.example.esunsocialmediahw.dto.UpdatePostDTO;
import com.example.esunsocialmediahw.dto.postDTO;

import java.util.List;

public interface postService {
    void createPost(postDTO post);
    void updatePost(UpdatePostDTO updatePost);
    void deletePost(DeletePostDTO deletePost);
    List<PostDataDTO> showAllPost();
    List<PostDataDTO> getUserPosts(Long userID);
}