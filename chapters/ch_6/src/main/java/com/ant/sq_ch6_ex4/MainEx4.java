package com.ant.sq_ch6_ex4;

import com.ant.Comment;
import com.ant.sq_ch6_ex4.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class MainEx4 {
    private static Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigEx4.class);
        var commentService = c.getBean(CommentService.class);
        Comment comment = new Comment("Demo Comment!", "Natasha");
        String val = commentService.publishComment(comment);
        logger.info(val);

        commentService.deleteComment(comment);
    }
}
