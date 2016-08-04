package ua.goit.java.menu;

import ua.goit.java.calculation.Area;
import ua.goit.java.calculation.Circle;
import ua.goit.java.calculation.Rectangle;
import ua.goit.java.calculation.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

public class AreaMenu {
    public static void processArea() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Вычисление площади треугольника - введите 1");
            System.out.println("Вычисление площади прямоугольника - введите 2");
            System.out.println("Вычисление площади круга - введите 3");
            System.out.println("Возврат в предыдущее меню - введите 0");

            String str = br.readLine();
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
            double a = abs(Service.inputData("Введите длину первой стороны треугольника\n"));
            double b = abs(Service.inputData("Введите длину второй стороны треугольника\n"));
            double c = abs(Service.inputData("Введите длину третьей стороны треугольника\n"));

            Area area = new Triangle(a, b, c);
            Double ar = area.calculateArea();

            if (ar.toString().equals("NaN")) {
                System.out.println("Некорректно заданы значения сторон, треугольника с такими значениями сторон не существует");
            } else {
                System.out.println("Площадь треугольника со сторонами " + a + ", " + b + " и " + c + " равна " + ar);
            }

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaRectangle() throws IOException {
        while (true) {
            double a = abs(Service.inputData("Введите длину первой стороны прямоугольника\n"));
            double b = abs(Service.inputData("Введите длину второй стороны прямоугольника\n"));

            Area area = new Rectangle(a, b);
            System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area.calculateArea());

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaCircle() throws IOException {
        while (true) {
            double r = abs(Service.inputData("Введите радиус круга\n"));

            Area area = new Circle(r);
            System.out.println("Площадь круга с радиусом " + r + " равна " + area.calculateArea());

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }
}
