package com.ant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ant")
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("koko");
        return p;
    }

    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    Parrot parrot3(){
        return new Parrot();
    }

    @Bean(name = "ten")
    Integer ten() {
        return 10;
    }

    @Bean(value = "hello")
    String hello() {
        return "hello";
    }
}
