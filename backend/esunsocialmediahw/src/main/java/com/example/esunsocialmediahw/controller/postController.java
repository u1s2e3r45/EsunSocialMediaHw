package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.DeletePostDTO;
import com.example.esunsocialmediahw.dto.UpdatePostDTO;
import com.example.esunsocialmediahw.dto.postDTO;
import com.example.esunsocialmediahw.service.postService;
import org.springframework.web.bind.annotation.RequestBody;

public class postController {
    private postService postService;

    public String createPost(@RequestBody postDTO post) {
        postService.createPost(post);
        return "成功發文";
    }

    public String updatePost(@RequestBody UpdatePostDTO updatePost){
        postService.updatePost(updatePost);
        return "貼文更新成功";
    }
    public String deletePost(@RequestBody DeletePostDTO deletePost){
        postService.deletePost(deletePost);
        return "貼文刪除成功";
    }
}
