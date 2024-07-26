package src.main.java.com.exemplo;

public class Conversor {
    
    // Método para converter Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Método para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        // Testando os métodos de conversão
        double tempFahrenheit = 98.6;
        double tempCelsius = 37;

        System.out.println(tempFahrenheit + " °F é igual a " + fahrenheitParaCelsius(tempFahrenheit) + " °C");
        System.out.println(tempCelsius + " °C é igual a " + celsiusParaFahrenheit(tempCelsius) + " °F");
    }
}
