package ua.goit.java.menu;

import ua.goit.java.shape.Shape;
import ua.goit.java.shape.Circle;
import ua.goit.java.shape.Rectangle;
import ua.goit.java.shape.Triangle;
import ua.goit.java.controller.InputController;

import java.io.IOException;

import static java.lang.Math.abs;

public class AreaMenu {
    public static void processArea() throws IOException {
        while (true) {
            System.out.println("Вычисление площади треугольника - введите 1");
            System.out.println("Вычисление площади прямоугольника - введите 2");
            System.out.println("Вычисление площади круга - введите 3");
            System.out.println("Возврат в предыдущее меню - введите 0");

            String str = InputController.br.readLine();
            switch (str) {
                case "1":
                    processAreaTriangle();
                    break;
                case "2":
                    processAreaRectangle();
                    break;
                case "3":
                    processAreaCircle();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }

    private static void processAreaTriangle() throws IOException {
        while (true) {
            double a = abs(InputController.inputData("Введите длину первой стороны треугольника\n"));
            double b = abs(InputController.inputData("Введите длину второй стороны треугольника\n"));
            double c = abs(InputController.inputData("Введите длину третьей стороны треугольника\n"));

            Shape shape = new Triangle(a, b, c);
            Double ar = shape.calculateArea();

            if (ar.toString().equals("NaN")) {
                System.out.println("Некорректно заданы значения сторон, треугольника с такими значениями сторон не существует");
            } else {
                System.out.println("Площадь треугольника со сторонами " + a + ", " + b + " и " + c + " равна " + ar);
            }

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaRectangle() throws IOException {
        while (true) {
            double a = abs(InputController.inputData("Введите длину первой стороны прямоугольника\n"));
            double b = abs(InputController.inputData("Введите длину второй стороны прямоугольника\n"));

            Shape shape = new Rectangle(a, b);
            System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + shape.calculateArea());

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaCircle() throws IOException {
        while (true) {
            double r = abs(InputController.inputData("Введите радиус круга\n"));

            Shape shape = new Circle(r);
            System.out.println("Площадь круга с радиусом " + r + " равна " + shape.calculateArea());

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }
}
