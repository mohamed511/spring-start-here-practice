package com.ant;

import java.util.List;

public class Dog {
    private String name;
    private String color;

    public Dog() {
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public List<Dog> getAllDogs() {
        return List.of(new Dog("Dog1", "Black"), new Dog("Dog2", "White")
        , new Dog("Dog3", "Brown"), new Dog("Dog4", "Black"));
    }
}
