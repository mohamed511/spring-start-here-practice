package com.ant.sq_ch6_ex1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.ant.sq_ch6_ex1.*.*(..))")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        //logger.info("Method called: " + proceedingJoinPoint.getSignature().getName());
        logger.info("Method execute");
        proceedingJoinPoint.proceed();
        logger.info("Method finished");
        //logger.info("Method finished: " + proceedingJoinPoint.getSignature().getName());
    }
}
