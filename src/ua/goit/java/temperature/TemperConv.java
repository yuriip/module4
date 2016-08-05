package ua.goit.java.temperature;

public class TemperConv {
    private final static int POINT_ICE_MELTING = 32;
    private final static float INTERVAL_FREEZING_BOILING_WATER = 1.8f;

    /**
     * Метод для преобразования значения температуры по шкале Цельсия
     * в значение по шкале Фаренгейта используя формулу:
     * temperFahrenheit = temperCelsius * 1.8 + 32
     */
    public float getFahrenheit(float temperCelsius) {
        return temperCelsius * INTERVAL_FREEZING_BOILING_WATER + POINT_ICE_MELTING;
    }

    /**
     * Метод для преобразования значения температуры по шкале Фаренгейта
     * в значение по шкале Цельсия используя формулу:
     * temperCelsius = (temperFahrenheit - 32) / 1.8
     */
    public float getCelsius(float temperFahrenheit) {
        return (temperFahrenheit - POINT_ICE_MELTING) / INTERVAL_FREEZING_BOILING_WATER;
    }
}
