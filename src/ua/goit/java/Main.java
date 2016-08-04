package ua.goit.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.NativeNumber.NaN;

public class Main {

    public static void main(String[] args) {
        try {
            processMenu();
        } catch (IOException e) {
            System.out.println("!!! Глобальная ошибка ввода данных. Попробуйте перезапустить программу !!!");
        }
    }

    private static void processMenu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Вычисление площади простых геометрических фигур - введите 1");
            System.out.println("Преобразование значения температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении  - введите 2");
            System.out.println("Вычисление расстояния между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2)  - введите 3");
            System.out.println("Выход из программы - введите в");

            String str = br.readLine();
            switch (str) {
                case "1":
                    processArea();
                    break;
                case "2":
                    processTemperConv();
                    break;
                case "3":
                    processDistance();
                    break;
                case "в":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }

    private static void processArea() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Вычисление площади треугольника - введите 1");
            System.out.println("Вычисление площади прямоугольника - введите 2");
            System.out.println("Вычисление площади круга - введите 3");
            System.out.println("Возврат в предыдущее меню - введите в");

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
                case "в":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }

    private static void processTemperConv() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Преобразовать значение температуры по шкале Цельсия в значение по шкале Фаренгейта - введите 1");
            System.out.println("Преобразовать значение температуры по шкале Фаренгейта в значение по шкале Цельсия - введите 2");
            System.out.println("Возврат в предыдущее меню - введите в");

            String str = br.readLine();
            switch (str) {
                case "1":
                    processTemperConvFahrenheit();
                    break;
                case "2":
                    processTemperConvCelsius();
                    break;
                case "в":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }

    private static void processDistance() throws IOException {
        System.out.println("Вычисление расстояния между двумя точками");
        while (true) {
            String str = "Введите координату x первой точки";
            double[] pointA = new double[2];
            pointA[0] = inputData(str);

            str = "Введите координату y первой точки";
            pointA[1] = inputData(str);

            str = "Введите координату x второй точки";
            double[] pointB = new double[2];
            pointB[0] = inputData(str);

            str = "Введите координату y второй точки";
            pointB[1] = inputData(str);

            Distance distance = new Distance();
            System.out.println("Расстояния между точками А(" + pointA[0] + ", " + pointA[1] + ") и B(" + pointB[0] + ", " + pointB[1] + ") равно " + distance.getDistanceTwoPoints(pointA, pointB));

            if (!isContinue(true)) {
                return;
            }
        }

    }

    private static void processAreaTriangle() throws IOException {
        while (true) {
            String str = "Введите длину первой стороны треугольника";
            double a = inputData(str);

            str = "Введите длину второй стороны треугольника";
            double b = inputData(str);

            str = "Введите длину третьей стороны треугольника";
            double c = inputData(str);

            Area area = new Area();

            Double ar = area.getAreaTriangle(a, b, c);

            if (ar.toString().equals("NaN")) {
                System.out.println("Некорректно заданы значения сторон, треугольника с такими значениями сторон не существует");
            } else {
                System.out.println("Площадь треугольника со сторонами " + a + ", " + b + " и " + c + " равна " + ar);
            }

            if (!isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaRectangle() throws IOException {
        while (true) {
            String str = "Введите длину первой стороны прямоугольника";
            double a = inputData(str);

            str = "Введите длину второй стороны прямоугольника";
            double b = inputData(str);

            Area area = new Area();
            System.out.println("Площадь прямоугольника со сторонами " + a + ", " + b + " равна " + area.getAreaRectangle(a, b));

            if (!isContinue(true)) {
                return;
            }
        }
    }

    private static void processAreaCircle() throws IOException {
        while (true) {
            String str = "Введите радиус круга";
            double r = inputData(str);

            Area area = new Area();
            System.out.println("Площадь круга с радиусом " + r + " равна " + area.getAreaCircle(r));

            if (!isContinue(true)) {
                return;
            }
        }
    }

    private static void processTemperConvCelsius() throws IOException {
        while (true) {
            String str = "Введите значение температуры по шкале Фаренгейта";
            float t = (float) inputData(str);

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Цельсия равна " + temperConv.getCelsius(t));

            if (!isContinue(true)) {
                return;
            }
        }
    }

    private static void processTemperConvFahrenheit() throws IOException {
        while (true) {
            String str = "Введите значение температуры по шкале Цельсия";
            float t = (float) inputData(str);

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Фаренгейта равна " + temperConv.getFahrenheit(t));

            if (!isContinue(true)) {
                return;
            }
        }
    }

    private static double inputData(String str) throws IOException {
        System.out.println(str);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double res;
        while (true) {
            try {
                String str1 = br.readLine();
                res = Double.parseDouble(str1);
                break;
            } catch (NullPointerException | NumberFormatException e) {
                System.out.println("!!! Ошибка. Необходимо ввести число. Попробуйте еще раз !!!");
                System.out.println("!!! " + str + " !!!");
            }
        }
        return res;
    }

    private static boolean isContinue(boolean isContinue) throws IOException {
        String str;
        while (isContinue) {
            System.out.println("Чтобы продолжить введите п");
            System.out.println("Чтобы вернуться в предыдущее меню введите в");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            switch (str) {
                case "п":
                    isContinue = false;
                    break;
                case "в":
                    return false;
                default:
                    System.out.println("!!! Выбор не сделан. Попробуйте еще раз !!!");
            }
        }
        return true;
    }
}
