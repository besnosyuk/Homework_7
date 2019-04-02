package com.groupqa1;

class Shape {
    private String color;

    Shape() {
    }

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    public String toString() {
        return "Class = " + getClass().getName() + "\n" + "Color = " + getColor();
    }

    public double CalcArea() {
        return 0.0;
    }
}
