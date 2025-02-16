package junittestproblems.advance.temperature;


import static junittestproblems.advance.temperature.Temperature.celsiusToFahrenheit;
import static junittestproblems.advance.temperature.Temperature.fahrenheitToCelsius;

public class TemperatureMain {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        double convertedToFahrenheit = celsiusToFahrenheit(celsius);
        double convertedToCelsius = fahrenheitToCelsius(fahrenheit);

        System.out.println(celsius + "°C = " + convertedToFahrenheit + "°F");
        System.out.println(fahrenheit + "°F = " + convertedToCelsius + "°C");
    }
}
