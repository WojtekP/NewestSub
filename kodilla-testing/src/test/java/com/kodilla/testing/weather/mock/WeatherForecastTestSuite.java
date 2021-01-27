package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    private int counter = 0;

    @BeforeEach
    public void beforeEach() {
        counter++;
        System.out.println("Preparing mock...");
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        System.out.println("Starting the test No." + counter);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test No." + counter + "ended.");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Starting Wheather Forecast Test Suite...");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Wheater Forecast Test Suite ended.");
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateWeatherForecast() {
        //Given


        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Average test")
    @Test
    void testCalculateAverage() {
        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double averages = weatherForecast.average();
        //Then
        Assertions.assertEquals(25.560000000000002, averages);
    }

    @DisplayName("Mediane Test")
    @Test
    void testCalculateMediane() {
        //Given

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double mediane = weatherForecast.mediane();
        //Then
        Assertions.assertEquals(25.5, mediane);

    }
}
