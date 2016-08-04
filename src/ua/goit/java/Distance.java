package ua.goit.java;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Distance {
    public double getDistanceTwoPoints(double[] pointA, double[] pointB) {
        // Для вычисления расстояние между двумя точками используется формула:
        // distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
        // (x1, y1), (x2, y2) - двух точек, которые находятся в массивах pointA и pointB соответственно
        double distance = sqrt(pow((pointB[0] - pointA[0]), 2) + pow((pointB[1] - pointA[1]), 2));
        return distance;
    }
}
