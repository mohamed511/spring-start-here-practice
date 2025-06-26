package com.ant.prototype_real_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    ApplicationContext applicationContext;

    public void sendComment(Comment c) {
        /*
         * need to inject CommentProcessor bean in the method itself
         * as we need every time a call sendComment to create
         * new instance of CommentProcessor
         * */
        CommentProcessor commentProcessor = applicationContext.getBean(CommentProcessor.class);
        commentProcessor.setComment(c);
        commentProcessor.validateComment();
        commentProcessor.processComment();
        c = commentProcessor.getComment();
        System.out.println(c);
    }
}
