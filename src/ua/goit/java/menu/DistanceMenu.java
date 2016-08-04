package ua.goit.java.menu;

import ua.goit.java.calculation.Point;

import java.io.IOException;

public class DistanceMenu {
    public static void processDistance() throws IOException {
        System.out.println("Вычисление расстояния между двумя точками");
        while (true) {
            double x;
            double y;
            x = Service.inputData("Введите координату x первой точки\n");
            y = Service.inputData("Введите координату y первой точки\n");
            Point pointA = new Point(x, y);

            x = Service.inputData("Введите координату x второй точки\n");
            y = Service.inputData("Введите координату y второй точки\n");
            Point pointB = new Point(x, y);

            System.out.println("Расстояния между точками А(" + pointA.getX() + ", " + pointA.getY() + ") и " +
                    "B(" + pointB.getX() + ", " + pointB.getY() + ") равно " + Point.calculateDistance(pointA, pointB));

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }
}
