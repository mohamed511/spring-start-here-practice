package com.ant.sq_ch6_ex1.impl;

import com.ant.Comment;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@Lazy
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publish Comment: " + comment.getText() + " by " + comment.getAuthor());
    }
}
