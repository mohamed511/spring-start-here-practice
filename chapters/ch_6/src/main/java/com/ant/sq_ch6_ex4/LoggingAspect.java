package com.ant.sq_ch6_ex4;

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
    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Method execute");
        proceedingJoinPoint.proceed();
        logger.info("Method finished");
    }
}
