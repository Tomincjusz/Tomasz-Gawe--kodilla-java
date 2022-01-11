package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    String shapeName;
    int field;

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return getField() == square.getField() &&
                Objects.equals(getShapeName(), square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShapeName(), getField());
    }


    public Square(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
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