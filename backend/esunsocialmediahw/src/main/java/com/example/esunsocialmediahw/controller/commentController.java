package com.example.esunsocialmediahw.controller;

import com.example.esunsocialmediahw.dto.ResponseDTO;
import com.example.esunsocialmediahw.dto.commentDTO;
import com.example.esunsocialmediahw.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173/", allowCredentials = "true")
@RestController
@RequestMapping("/commentController")
public class commentController {
    @Autowired
    private commentService commentService;

    @PostMapping("/createComment")
    public ResponseDTO createComment(@RequestBody commentDTO comment){
        ResponseDTO response = new ResponseDTO();
        response.setStatus(commentService.createComment(comment));
        return response;
    }
}
