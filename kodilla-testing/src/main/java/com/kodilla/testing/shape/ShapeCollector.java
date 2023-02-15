package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ShapeCollector {

    private Shape shape;

    private List<Shape> shapesList = new ArrayList<>();

    public List<Shape> getShapesList() {
        return shapesList;
    }
    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapesList.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapesList.get(n);
    }

    public String showFigures() {
        String allShapes = "";
        Iterator<Shape> iteratorShapesList = shapesList.iterator();
        while (iteratorShapesList.hasNext()) {
            Shape temporaryShape = iteratorShapesList.next();
            String temporaryName = temporaryShape.getShapeName();
            allShapes += temporaryName;
            if (iteratorShapesList.hasNext())
                allShapes += ", ";
        }
        return allShapes;
    }
}