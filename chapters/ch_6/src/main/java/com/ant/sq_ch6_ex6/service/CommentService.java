package com.ant.sq_ch6_ex6.service;

import com.ant.Comment;
import com.ant.sq_ch6_ex6.ToLog;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publish Comment: " + comment.getText() + " by " + comment.getAuthor());
        return "SUCCESS";
    }

    @ToLog
    public void deleteComment(Comment comment){
        logger.info("Delete Comment: " + comment.getText() + " by " + comment.getAuthor());
    }

    public void editComment(Comment comment){
        logger.info("Edit Comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
