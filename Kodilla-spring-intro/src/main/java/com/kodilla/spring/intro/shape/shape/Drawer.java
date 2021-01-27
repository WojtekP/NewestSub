package com.kodilla.spring.intro.shape.shape;

import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Figure;
import com.kodilla.spring.intro.shape.Triangle;

public class Drawer {
    final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }
}

