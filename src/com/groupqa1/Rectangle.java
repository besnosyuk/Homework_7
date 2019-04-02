package com.groupqa1;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {
    }

    Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Class = " + getClass().getName() +
                "\n" + "Color = " + getColor() +
                "\n" + "Width = " + width +
                "\n" + "Height = " + height;
    }

    @Override
    public double CalcArea() {
        return width * height;
    }
}
