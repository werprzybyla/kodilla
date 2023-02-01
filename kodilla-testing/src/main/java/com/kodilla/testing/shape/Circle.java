package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String shapeName;
    private int field;

    public Circle(String shapeName, int field) {
        this.shapeName = shapeName;
        this.field = field;
    }
    @Override
    public String getShapeName() {
        return this.shapeName;
    }

    @Override
    public int getField() {
        return this.field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.field, field) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
