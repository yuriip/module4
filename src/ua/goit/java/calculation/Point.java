package ua.goit.java.calculation;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Метод для вычисления расстояние между двумя точками используя формулу:
     * distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
     * (x1, y1), (x2, y2) - двух точек, которые находятся в массивах pointA и pointB соответственно
     */
    public static double calculateDistance(Point a, Point b) {
        double distance = sqrt(pow((b.x - a.x), 2) + pow((b.y - a.y), 2));
        return distance;
    }
}
