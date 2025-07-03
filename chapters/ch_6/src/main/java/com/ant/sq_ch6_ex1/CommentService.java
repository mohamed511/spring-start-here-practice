package com.ant.sq_ch6_ex1;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publish Comment: " + comment.getText() + " by " + comment.getAuthor());
    }

    public void test(Comment comment){
        logger.info("test: ======>");
    }
}
