package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    @Test
    public void testFahrenheitToCelsius() {
        Conversor conversor = new Conversor();
        double result = conversor.fahrenheitToCelsius(32); // 32°F deve ser 0°C
        assertEquals(0, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        Conversor conversor = new Conversor();
        double result = conversor.celsiusToFahrenheit(0); // 0°C deve ser 32°F
        assertEquals(31, result, 0.01);
    }
}
