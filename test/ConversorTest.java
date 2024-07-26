package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTest {

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(10, Conversor.fahrenheitParaCelsius(50), 0.001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(50, Conversor.celsiusParaFahrenheit(10), 0.001);
    }
}
