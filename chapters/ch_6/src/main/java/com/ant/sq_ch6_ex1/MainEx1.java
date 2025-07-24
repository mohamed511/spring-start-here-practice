package com.ant.sq_ch6_ex1;

import com.ant.Comment;
import com.ant.sq_ch6_ex1.impl.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class MainEx1 {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfigEx1.class);
        var commentService = c.getBean(CommentService.class);
        Comment comment = new Comment("This is a great book!", "John Doe");
        commentService.publishComment(comment);
    }
}
