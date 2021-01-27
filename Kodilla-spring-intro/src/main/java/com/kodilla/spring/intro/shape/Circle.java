package com.kodilla.spring.intro.shape;

import com.kodilla.spring.intro.shape.shape.Shape;

public class Circle implements Shape {
    @Override
    public String draw() {
        System.out.println("This is a circle");
        return "This is a circle";
    }
}
