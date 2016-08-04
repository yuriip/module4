package ua.goit.java;

import ua.goit.java.menu.MainMenu;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            MainMenu.processMenu();
        } catch (IOException e) {
            System.out.println("!!! Глобальная ошибка ввода данных. Попробуйте перезапустить программу !!!");
        }
    }
}
