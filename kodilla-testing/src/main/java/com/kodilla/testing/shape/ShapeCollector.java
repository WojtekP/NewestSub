package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapes = new ArrayList<>();

    public void addFigures(Shape shape) {
        shapes.add(shape);

    }

    public int getFiguresQuantity() {
        return shapes.size();
    }

    public boolean removeFigures(Shape shape) {
        boolean answer = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            answer = true;
        }
        return answer;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if (n >= 0 && n < shapes.size()) {
            theShape = shapes.get(n);

        }
        return theShape;
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
