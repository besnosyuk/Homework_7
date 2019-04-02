package com.groupqa1;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle("Blue", 30, 15);
        Rectangle rectangle2 = new Rectangle("Red", 12, 10);
        Rectangle rectangle3 = new Rectangle("Black", 3, 4);
        Rectangle rectangle4 = new Rectangle("Yellow", 2, 8);

        Circle circle1 = new Circle("White", 5);
        Circle circle2 = new Circle("Green", 6);
        Circle circle3 = new Circle("Red", 13);

        Triangle triangle1 = new Triangle("White", 4, 3, 5);
        Triangle triangle2 = new Triangle("Brown", 6, 8, 10);

        Shape[] figures = new Shape[]{rectangle1, rectangle2, rectangle3, rectangle4,
                circle1, circle2, circle3,
                triangle1, triangle2};

        DecimalFormat df = new DecimalFormat("#.00");

        showShapes(figures);
        System.out.println("\nTotal Area of figures = " + df.format(totalArea(figures)));
        showAreas(areaEachFigure(figures));

    }

    private static void showShapes(Shape[] figures) {
        for (Shape item : figures) {
            System.out.println(item.toString() + "\n" + "Area: " + item.CalcArea());
        }
    }

    private static double totalArea(Shape[] figures) {
        double totalArea = 0.0;
        for (Shape item : figures) {
            totalArea += item.CalcArea();
        }
        return totalArea;
    }

    private static double[] areaEachFigure(Shape[] figures) {
        double areaOfCircles = 0.0,
                areaOfRectangles = 0.0,
                areaOfTriangles = 0.0;
        for (Shape item : figures) {
            if (item instanceof Circle) {
                areaOfCircles += item.CalcArea();
            }
            if (item instanceof Rectangle) {
                areaOfRectangles += item.CalcArea();
            }
            if (item instanceof Triangle) {
                areaOfTriangles += item.CalcArea();
            }
        }
        return new double[]{areaOfCircles, areaOfRectangles, areaOfTriangles};
    }

    private static void showAreas(double[] array) {
        System.out.println("\n" + "Total area of Circles = " + array[0] +
                "\n" + "Total area of Rectangles = " + array[1] +
                "\n" + "Total area of Triangles = " + array[2]);
    }

}
