package com.ant;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

/**
 * Cat class
 * use @Component to create a bean
 *
 * @author khalil
 */
@Component
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "coco";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat bean is being destroyed");
        this.name = null;
    }
}
