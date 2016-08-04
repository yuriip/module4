package ua.goit.java.menu;

import ua.goit.java.calculation.TemperConv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemperatureMenu {
    public static void processTemperConv() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Преобразовать значение температуры по шкале Цельсия в значение по шкале Фаренгейта - введите 1");
            System.out.println("Преобразовать значение температуры по шкале Фаренгейта в значение по шкале Цельсия - введите 2");
            System.out.println("Возврат в предыдущее меню - введите 0");

            String str = br.readLine();
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
            float t = (float) Service.inputData("Введите значение температуры по шкале Цельсия\n");

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Фаренгейта равна " + temperConv.getFahrenheit(t));

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }

    private static void processTemperConvCelsius() throws IOException {
        while (true) {
            float t = (float) Service.inputData("Введите значение температуры по шкале Фаренгейта\n");

            TemperConv temperConv = new TemperConv();
            System.out.println("Tемпература по шкале Цельсия равна " + temperConv.getCelsius(t));

            if (!Service.isContinue(true)) {
                return;
            }
        }
    }
}
