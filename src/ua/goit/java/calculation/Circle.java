package ua.goit.java.calculation;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Area {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    /**
     * Метод для вычисления площади круга используя формулу:
     * s = pi * r * r
     * s - площадь круга
     * r - радиус круга
     */
    @Override
    public double calculateArea() {
        double s = PI * pow(r, 2);
        return s;
    }
}
