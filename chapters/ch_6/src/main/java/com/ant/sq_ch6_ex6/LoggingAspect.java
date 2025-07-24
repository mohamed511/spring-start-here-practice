package com.ant.sq_ch6_ex6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("LoggingAspect: Method execute");
        proceedingJoinPoint.proceed();
        logger.info("LoggingAspect: Method finished");
    }
}
