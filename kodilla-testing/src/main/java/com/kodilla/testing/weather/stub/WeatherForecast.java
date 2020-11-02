package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double average() {
        double average = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            average += (temperature.getValue() / temperatures.getTemperatures().size());
        }

        return average;
    }

    public double mediane() {
        double mediane = 0;
        List<Double> mapValues = new ArrayList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            mapValues.add(temperature.getValue());
        }
        Collections.sort(mapValues);
        if(mapValues.size()%2 == 0){
           mediane = ((mapValues.get(mapValues.size()) + mapValues.get(mapValues.size() + 1)) / 2);
        }else {
           mediane =  mapValues.get(((mapValues.size() + 1) / 2)-1);

        }

        return mediane;
    }
}