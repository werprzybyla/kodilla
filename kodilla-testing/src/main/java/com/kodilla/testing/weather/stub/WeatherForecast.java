package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            //adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0.0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            sum += temperature.getValue();
        }
        double averageTemperature = sum / temperatures.getTemperatures().size();
        return averageTemperature;
    }

    public double calculateMedianTemperature() {
        List<Double> temperaturesList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            temperaturesList.add(temperature.getValue());
        }
        Collections.sort(temperaturesList);

        if (temperaturesList.size() % 2 == 0) {
            int firstIndex = temperaturesList.size() / 2;
            int secondIndex = firstIndex + 1;
            double median = (temperaturesList.get(firstIndex) + temperaturesList.get(secondIndex)) / 2;
            return median;
        } else {
            int index = temperaturesList.size() / 2;
            double median = temperaturesList.get(index);
            return median;
        }
    }
}
