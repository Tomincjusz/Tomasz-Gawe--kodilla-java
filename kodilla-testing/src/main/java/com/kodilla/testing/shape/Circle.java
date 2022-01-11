package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    String shapeName;
    int field;
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
    @Override
    public int getField() {
        return field;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return getField() == circle.getField() &&
                Objects.equals(getShapeName(), circle.getShapeName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), getField());
    }
    public Circle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }
}