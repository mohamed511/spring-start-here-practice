package com.ant.sq_ch6_ex2;

import org.springframework.context.annotation.*;


@Configuration
@ComponentScan(basePackages = "com.ant.sq_ch6_ex2")
@EnableAspectJAutoProxy
public class ProjectConfigEx2 {

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
