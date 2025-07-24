package com.ant.sq_ch6_ex3;

import com.ant.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    /**
     * altering the params and the return value for the method
     */
    @Around("execution(* com.ant.sq_ch6_ex3.service.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Method execute");
        String methodName = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        logger.info("Method: " + methodName + " args: " + Arrays.asList(args));

        Comment comment = new Comment();
        comment.setAuthor("Aspect");
        comment.setText("From Aspect");
        Object[] newArgs = {comment};

        Object returnedValue = proceedingJoinPoint.proceed(newArgs);
        logger.info("Method finished and return: " + returnedValue);
        logger.info("Method finished");
        return "Failed";
    }
}
