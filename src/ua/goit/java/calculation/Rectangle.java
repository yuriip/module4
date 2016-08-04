package ua.goit.java.calculation;

public class Rectangle extends Area {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Метод для вычисления площади прямоугольника используя формулу:
     * s = a * b
     * s - площадь прямоугольника
     * a, b - длины сторон прямоугольника
     */
    @Override
    public double calculateArea() {
        double s = a * b;
        return s;
    }
}
