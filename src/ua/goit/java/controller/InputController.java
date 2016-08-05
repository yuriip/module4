package ua.goit.java.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputController {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static double inputData(String str) throws IOException {
        System.out.print(str);
        double res;

        while (true) {
            try {
                String str1 = br.readLine();
                res = Double.parseDouble(str1);
                break;
            } catch (NullPointerException | NumberFormatException e) {
                str = str.substring(0, str.length() - 1);
                System.out.println("!!! Ошибка. Необходимо ввести число. Попробуйте еще раз !!!");
                System.out.println("!!! " + str + " !!!");
            }
        }
        return res;
    }

    public static boolean isContinue(boolean isContinue) throws IOException {
        String str;

        while (isContinue) {
            System.out.println("Чтобы продолжить введите 9");
            System.out.println("Чтобы вернуться в предыдущее меню введите 0");

            str = br.readLine();
            switch (str) {
                case "9":
                    isContinue = false;
                    break;
                case "0":
                    return false;
                default:
                    System.out.println("!!! Выбор не сделан. Попробуйте еще раз !!!");
            }
        }
        return true;
    }
}
