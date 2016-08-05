package ua.goit.java.line;

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
    public double calculateDistance(Point point) {
        double distance = sqrt(pow((point.x - this.x), 2) + pow((point.y - this.y), 2));
        return distance;
    }
}
