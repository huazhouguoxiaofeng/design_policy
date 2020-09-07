package com.gxf.www.observer;

import com.gxf.www.observer.display.CurrentConditionDisplay;

public class ObserverMain {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        final CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.0f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,28.3f);
    }
}
