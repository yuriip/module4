package ua.goit.java.menu;

import ua.goit.java.temperature.TemperConv;
import ua.goit.java.controller.InputController;

import java.io.IOException;

public class TemperatureMenu {
    public static void processTemperConv() throws IOException {
        while (true) {
            System.out.println("Преобразовать значение температуры по шкале Цельсия в значение по шкале Фаренгейта - введите 1");
            System.out.println("Преобразовать значение температуры по шкале Фаренгейта в значение по шкале Цельсия - введите 2");
            System.out.println("Возврат в предыдущее меню - введите 0");

            String str = InputController.br.readLine();
            switch (str) {
                case "1":
                    processTemperConvFahrenheit();
                    break;
                case "2":
                    processTemperConvCelsius();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("!!! Выбор не сделан, попробуйте еще раз !!!");
            }
        }
    }

    private static void processTemperConvFahrenheit() throws IOException {
        while (true) {
            float t = (float) InputController.inputData("Введите значение температуры по шкале Цельсия\n");

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Фаренгейта равна " + temperConv.getFahrenheit(t));

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }

    private static void processTemperConvCelsius() throws IOException {
        while (true) {
            float t = (float) InputController.inputData("Введите значение температуры по шкале Фаренгейта\n");

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Цельсия равна " + temperConv.getCelsius(t));

            if (!InputController.isContinue(true)) {
                return;
            }
        }
    }
}
