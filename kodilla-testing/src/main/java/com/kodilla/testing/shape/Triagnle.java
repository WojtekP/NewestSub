package com.kodilla.testing.shape;

public class Triagnle implements Shape {
    private String name;
    private int length;
    private int heigth;

    public Triagnle(String name, int length, int heigth) {
        this.name = name;
        this.length = length;
        this.heigth = heigth;
    }

    public String getShapeName() {

        return name;
    }

    public double getField() {

    return 0.5*length*heigth;}
}
