package ua.goit.java.menu;

import ua.goit.java.controller.InputController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {
    public static void processMenu() throws IOException {
        while (true) {
            System.out.println("Вычисление площади простых геометрических фигур - введите 1");
            System.out.println("Преобразование значения температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении  - введите 2");
            System.out.println("Вычисление расстояния между двумя точками, представленными координатами в двумерном пространстве (x1, y1), (x2, y2)  - введите 3");
            System.out.println("Выход из программы - введите 0");

            String str = InputController.br.readLine();
            switch (str) {
                case "1":
                    AreaMenu.processArea();
                    break;
                case "2":
                    TemperatureMenu.processTemperConv();
                    break;
                case "3":
                    DistanceMenu.processDistance();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }
}
