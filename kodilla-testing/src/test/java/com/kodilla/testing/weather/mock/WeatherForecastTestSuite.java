package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void generateMockForTests() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalcAverageTemp() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double average = weatherForecast.averageTemp();

        //Then
        Assertions.assertEquals(25.56, average);
    }

    @Nested
    class testsCalcMedianTemp {

        @Test
        void testcalcMedianTempOdd() {

            //Given
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double median = weatherForecast.medianTemp();

            //Then
            Assertions.assertEquals(25.5, median);
        }

        @Test
        void testcalcMedianTempEven() {

            //Given
            Map<String, Double> temperaturesMapEven = new HashMap<>();
            temperaturesMapEven.put("Rzeszow", 25.5);
            temperaturesMapEven.put("Krakow", 26.2);
            temperaturesMapEven.put("Wroclaw", 24.8);
            temperaturesMapEven.put("Warszawa", 25.2);

            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMapEven);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double median = weatherForecast.medianTemp();

            //Then
            Assertions.assertEquals(25.35, median);
        }
    }
}