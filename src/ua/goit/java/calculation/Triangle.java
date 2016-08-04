package ua.goit.java.calculation;

import static java.lang.Math.sqrt;

public class Triangle extends Area {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод для вычисления площади треугольника используя формулу Герона:
     * s = sqrt(p * (p - a) * (p - b) * (p - c))
     * s - площадь треугольника
     * p - полупериметр
     * p = (a + b + c) / 2
     * a, b, c - длины сторон треугольника
     */
    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
