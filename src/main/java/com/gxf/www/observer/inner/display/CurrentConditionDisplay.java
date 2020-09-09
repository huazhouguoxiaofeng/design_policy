package com.gxf.www.observer.inner.display;

import com.gxf.www.observer.inner.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {

    private Observable observable;
    private float humidity;
    private float temperature;

    public CurrentConditionDisplay(Observable observable){
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
        System.out.println("current temperature: " + temperature + ", humidity=" + humidity + '}');
    }

}
