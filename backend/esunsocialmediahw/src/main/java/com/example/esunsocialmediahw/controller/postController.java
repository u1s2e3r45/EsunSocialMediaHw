package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.*;
import com.example.esunsocialmediahw.service.postService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173/", allowCredentials = "true")
@RestController
@RequestMapping("/postController")
public class postController {
    @Autowired
    private postService postService;
    @PostMapping("/createPost")
    public ResponseDTO createPost(@RequestBody postDTO post) {
        ResponseDTO response = new ResponseDTO();
        response.setStatus(postService.createPost(post));
        return response;
    }
    @PostMapping("/updatePost")
    public ResponseDTO updatePost(@RequestBody UpdatePostDTO updatePost){
        ResponseDTO response = new ResponseDTO();
        response.setStatus(postService.updatePost(updatePost));
        return response;
    }
    @PostMapping("/deletePost")
    public ResponseDTO deletePost(@RequestBody DeletePostDTO deletePost){
        ResponseDTO response = new ResponseDTO();
        response.setStatus(postService.deletePost(deletePost));
        return response;
    }
    @PostMapping("/showAllPost")
    public List<PostDataDTO> showAllPost(){
        return postService.showAllPost();
    }
    @PostMapping("/showUserPost")
    public List<PostDataDTO> showUserPost(Long userID){
        return postService.showUserPost(userID);
    }
}
