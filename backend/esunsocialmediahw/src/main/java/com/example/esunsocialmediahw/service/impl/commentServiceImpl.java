package com.example.esunsocialmediahw.service.impl;

import com.example.esunsocialmediahw.dto.CommentDataDTO;
import com.example.esunsocialmediahw.dto.commentDTO;
import com.example.esunsocialmediahw.repository.commentRepository;
import com.example.esunsocialmediahw.service.commentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class commentServiceImpl implements commentService {

    @Autowired
    private commentRepository commentRepository;

    @Override
    public String createComment(commentDTO comment){
        commentRepository.createComment(
                comment.getUserID(),
                comment.getPostID(),
                comment.getContent()
        );
        return "0000";
    }

    public List<CommentDataDTO> getCommentsByPostID(Long postID) {

        List<Object[]> rows = commentRepository.showAllCommentOfPost(postID);

        List<CommentDataDTO> commentresult = new ArrayList<>();

        for (Object[] row : rows) {

            Long commentID = ((Number) row[0]).longValue();
            Long userID = ((Number) row[1]).longValue();
            String userName = (String) row[2];
            String content = (String) row[3];
            Timestamp Created_At = (Timestamp) row[4];

            commentresult.add(new CommentDataDTO(commentID, userID, userName, content, Created_At));
        }

        return commentresult;
    }
}
