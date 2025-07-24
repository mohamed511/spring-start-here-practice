package com.ant.sq_ch6_ex1;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "com.ant.sq_ch6_ex1")
@EnableAspectJAutoProxy
public class ProjectConfigEx1 {

    @Bean
    @Lazy
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
