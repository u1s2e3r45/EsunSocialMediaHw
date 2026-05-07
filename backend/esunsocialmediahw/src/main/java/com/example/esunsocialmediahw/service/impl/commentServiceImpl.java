package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.commentDTO;
import com.example.esunsocialmediahw.repository.commentRepository;
import com.example.esunsocialmediahw.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;

public class commentServiceImpl implements commentService {

    @Autowired
    private commentRepository commentRepository;

    @Override
    public void createComment(commentDTO comment){
        commentRepository.createComment(
                comment.getUserID(),
                comment.getPostID(),
                comment.getContent()
        );
    }
}
