package com.ant;

import com.ant.sq_ch6_ex1.Comment;
import com.ant.sq_ch6_ex1.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = c.getBean(CommentService.class);
        Comment comment = new Comment("This is a great book!", "John Doe");
        commentService.publishComment(comment);
        commentService.test(comment);
    }
}
