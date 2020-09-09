package com.gxf.www.observer.inner.display;

import com.gxf.www.observer.inner.WeatherData;
import com.gxf.www.observer.outer.DisplayElement;

import com.gxf.www.observer.outer.Subject;

import java.util.Observable;
import java.util.Observer;

/**
 * 此布告板跟踪最小、最大、平均值
 */
public class StatisticsDisplay implements Observer {

    private Observable observable;
    private float humidity;
    private float temperature;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }

    private void display() {
        System.out.println("StatisticsDisplay");
    }

}
