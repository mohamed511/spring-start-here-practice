package com.ant.sq_ch6_ex3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages = "com.ant.sq_ch6_ex3")
@EnableAspectJAutoProxy
public class ProjectConfigEx3 {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
