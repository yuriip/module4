package ua.goit.java;

public class TemperConv {
    public float getFahrenheit(float temperCelsius) {
        // Для преобразования значения температуры по шкале Цельсия
        // в значение по шкале Фаренгейта используется формула:
        // temperFahrenheit = temperCelsius * 9 / 5 + 32
        float temperFahrenheit = temperCelsius * 9 / 5 + 32;
        return temperFahrenheit;
    }

    public float getCelsius(float temperFahrenheit) {
        // Для преобразования значения температуры по шкале Фаренгейта
        // в значение по шкале Цельсия используется формула:
        // temperCelsius = (temperFahrenheit - 32) * 5 / 9
        float temperCelsius = (temperFahrenheit - 32) * 5 / 9;
        return temperCelsius;
    }
}
