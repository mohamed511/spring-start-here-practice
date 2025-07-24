package com.ant.sq_ch6_ex3.service;

import com.ant.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publish Comment: " + comment.getText() + " by " + comment.getAuthor());
        return "SUCCESS";
    }
}
