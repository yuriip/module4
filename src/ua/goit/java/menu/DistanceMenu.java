package ua.goit.java.menu;

import ua.goit.java.line.Point;
import ua.goit.java.controller.InputController;

import java.io.IOException;

public class DistanceMenu {
    public static void processDistance() throws IOException {
        System.out.println("Вычисление расстояния между двумя точками");
        while (true) {
            double x;
            double y;
            x = InputController.inputData("Введите координату x первой точки\n");
            y = InputController.inputData("Введите координату y первой точки\n");
            Point pointA = new Point(x, y);

            x = InputController.inputData("Введите координату x второй точки\n");
            y = InputController.inputData("Введите координату y второй точки\n");
            Point pointB = new Point(x, y);

            System.out.println("Расстояния между точками А(" + pointA.getX() + ", " + pointA.getY() + ") и " +
                    "B(" + pointB.getX() + ", " + pointB.getY() + ") равно " + pointA.calculateDistance(pointB));

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }
}
