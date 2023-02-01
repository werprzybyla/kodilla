package com.kodilla.testing.shape;

public class Square implements Shape {

    private String shapeName;
    private int field;

    public Square(String shapeName, int field) {
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

        Square square = (Square) o;

        if (Double.compare(square.field, field) != 0) return false;
        return shapeName.equals(square.shapeName);
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
