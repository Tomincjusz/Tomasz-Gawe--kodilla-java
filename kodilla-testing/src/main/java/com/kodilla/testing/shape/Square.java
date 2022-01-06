package com.kodilla.testing.shape;

public class Square implements Shape {
    private int a;
    private String name;

    public Square(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public String getShapeName() {
        return name;
    }

    public double getField(){
        return a*a;
    }
}