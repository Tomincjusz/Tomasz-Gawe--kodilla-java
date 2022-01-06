package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int r;
    private String name;

    public Circle(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return 2 * 3.14 * r;
    }
}