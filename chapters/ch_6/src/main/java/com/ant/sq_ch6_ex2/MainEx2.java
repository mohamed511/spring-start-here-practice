package com.ant.sq_ch6_ex2;

import com.ant.Comment;
import com.ant.sq_ch6_ex2.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class MainEx2 {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigEx2.class);
        var commentService = c.getBean(CommentService.class);
        Comment comment = new Comment("Demo Comment!", "Natasha");
        String val = commentService.publishComment(comment);

    }
}
