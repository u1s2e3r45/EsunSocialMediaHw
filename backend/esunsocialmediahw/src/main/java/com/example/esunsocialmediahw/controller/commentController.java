package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.commentDTO;
import com.example.esunsocialmediahw.service.commentService;
import org.springframework.web.bind.annotation.RequestBody;

public class commentController {
    private commentService commentService;

    public String createComment(@RequestBody commentDTO comment){
        commentService.createComment(comment);
        return "留言成功";
    }
}
