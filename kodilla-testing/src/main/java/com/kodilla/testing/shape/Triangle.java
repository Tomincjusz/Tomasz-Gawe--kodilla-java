package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    String shapeName;
    int field;

    public Triangle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return getField() == triangle.getField() &&
                Objects.equals(getShapeName(), triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), getField());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public int getField() {
        return 0;
    }
}