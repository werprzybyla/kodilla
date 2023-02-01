package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Nested square class test")
    class SquareTest {

        @Test
        void addFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 10);

            //When
            shapeCollector.addFigure(square);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesList().size());

        }

        void removeFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square",10);
            shapeCollector.addFigure(square);

            //When
            shapeCollector.removeFigure(square);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesList().size());
        }

        void getFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("square", 10);
            shapeCollector.addFigure(square);
            int n = 0;

            //When
            Shape retrievedShape = shapeCollector.getShapesList().get(n);

            //Then
            Assertions.assertEquals(square, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Nested circle class test")
    class CircleTest {

        @Test
        void addFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 10);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesList().size());

        }

        void removeFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 10);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesList().size());
        }

        void getFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle("circle", 10);
            shapeCollector.addFigure(circle);
            int n = 0;

            //When
            Shape retrievedShape = shapeCollector.getShapesList().get(n);

            //Then
            Assertions.assertEquals(circle, retrievedShape);
        }
    }

    @Nested
    @DisplayName("Nested triangle class test")
    class TriangleTest {

        @Test
        void addFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 10);

            //When
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesList().size());

        }

        void removeFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 10);
            shapeCollector.addFigure(triangle);

            //When
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesList().size());
        }

        void getFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Triangle triangle = new Triangle("triangle", 10);
            shapeCollector.addFigure(triangle);
            int n = 0;

            //When
            Shape retrievedShape = shapeCollector.getShapesList().get(n);

            //Then
            Assertions.assertEquals(triangle, retrievedShape);
        }
    }

    @Test
    void showFiguresTest() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 10);
        Circle circle = new Circle("circle", 10);
        Triangle triangle = new Triangle("triangle", 10);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //When
        String retrievedString = shapeCollector.showFigures();

        //Then
        Assertions.assertEquals("square, circle, triangle", retrievedString);
    }
}