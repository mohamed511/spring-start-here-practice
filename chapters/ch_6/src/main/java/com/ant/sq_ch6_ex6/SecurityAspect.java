package com.ant.sq_ch6_ex6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(2)
public class SecurityAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public void sec(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("SecurityAspect: Method execute");
        proceedingJoinPoint.proceed();
        logger.info("SecurityAspect: Method finished");
    }
}
