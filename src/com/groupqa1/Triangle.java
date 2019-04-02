package com.groupqa1;

public class Triangle extends Shape {
    private int a, b, c;

    public Triangle() {
    }

    Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Class = " + getClass().getName() +
                "\n" + "Color = " + getColor() +
                "\n" + "A = " + a +
                "\n" + "B = " + b +
                "\n" + "C = " + c;
    }

    @Override
    public double CalcArea() {
        double p = (double) (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));//formula Gerona;
    }
}
