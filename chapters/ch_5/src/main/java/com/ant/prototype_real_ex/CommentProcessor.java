package com.ant.prototype_real_ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
   private  Comment comment;
   @Autowired
   private CommentRepo commentRepo;

    public CommentProcessor(Comment comment) {
         this.comment = comment;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment() {
        // Simulate processing the comment
        System.out.println("Processing comment: " + comment.getMessage());
        // Additional processing logic can be added here
    }

    public void validateComment() {
        // Simulate validating the comment
        if (comment.getMessage() == null || comment.getMessage().isEmpty()) {
            throw new IllegalArgumentException("Comment message cannot be null or empty");
        }
        System.out.println("Comment is valid: " + comment.getMessage());
    }
}
