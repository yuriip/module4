package ua.goit.java;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Area {
    // Для вычисления площади треугольника используется формула Герона:
    // s = sqrt(p * (p - a) * (p - b) * (p - c))
    // a, b, c - длины сторон треугольника
    // p - полупериметр
    // s - площадь треугольника
    public double getAreaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    // Для вычисления площади прямоугольника используется формула:
    // s = a * b
    // a, b - длины сторон прямоугольника
    // s - площадь прямоугольника
    public double getAreaRectangle(double a, double b) {
        double s = a * b;
        return s;
    }

    // Для вычисления площади круга используется формула:
    // s = pi * r * r
    // r - радиус круга
    // s - площадь круга
    public double getAreaCircle(double r) {
        double s = PI * pow(r, 2);
        return s;
    }
}
