package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private int length;

    public Square(String shapeName, int length) {
        this.shapeName = shapeName;
        this.length = length;
    }

    public String getShapeName(){


        return shapeName;
    }

    public double getField(){

        return length*length;
    }
}
