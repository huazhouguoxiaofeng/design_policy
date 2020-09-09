package com.gxf.www.observer.inner;

import com.gxf.www.observer.inner.display.CurrentConditionDisplay;
import com.gxf.www.observer.inner.display.ForecastDisplay;
import com.gxf.www.observer.inner.display.StatisticsDisplay;

public class ObserverInnerMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.0f);

        System.out.println("****delete****");

        weatherData.deleteObserver(statisticsDisplay);
        weatherData.setMeasurements(82,70,29.2f);
//        weatherData.setMeasurements(78,90,28.3f);
    }
}
