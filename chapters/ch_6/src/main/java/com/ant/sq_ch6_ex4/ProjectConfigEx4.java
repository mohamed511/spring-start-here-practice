package com.ant.sq_ch6_ex4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.ant.sq_ch6_ex4")
@EnableAspectJAutoProxy
public class ProjectConfigEx4 {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
