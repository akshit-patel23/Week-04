package advancetest.temperaturetest;

import junittestproblems.advance.temperature.Temperature;
import org.junit.Assert;
import org.junit.Test;


public class TemperatureTest {

        @Test
       public void testCelsiusToFahrenheit(){
            Assert.assertEquals(32.0, Temperature.celsiusToFahrenheit(0), 0.001);
            Assert. assertEquals(212.0, Temperature.celsiusToFahrenheit(100), 0.001);
            Assert.assertEquals(98.6, Temperature.celsiusToFahrenheit(37), 0.001);
        }

        @Test
        public void testFahrenheitToCelsius(){
            Assert.assertEquals(0.0, Temperature.fahrenheitToCelsius(32), 0.001);
            Assert.assertEquals(100.0, Temperature.fahrenheitToCelsius(212), 0.001);
            Assert.assertEquals(37.0, Temperature.fahrenheitToCelsius(98.6), 0.001);
        }
    }
