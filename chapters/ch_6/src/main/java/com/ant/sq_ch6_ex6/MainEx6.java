package com.ant.sq_ch6_ex6;

import com.ant.Comment;
import com.ant.sq_ch6_ex6.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * Hello world!
 */
public class MainEx6 {
    private static Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigEx6.class);
        var commentService = c.getBean(CommentService.class);
        Comment comment = new Comment("Demo Comment!", "Natasha");
        commentService.deleteComment(comment);
    }
}
