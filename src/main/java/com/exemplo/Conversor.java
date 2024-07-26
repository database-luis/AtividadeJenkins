package com.exemplo;

public class Conversor {

    // Método para converter Fahrenheit para Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Método para converter Celsius para Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
}
