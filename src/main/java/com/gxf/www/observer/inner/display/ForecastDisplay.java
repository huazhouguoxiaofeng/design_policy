package com.gxf.www.observer.inner.display;

import com.gxf.www.observer.inner.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * 此布告板根据气压计显示天气预报
 */
public class ForecastDisplay implements Observer {

    private Observable observable;
    private float humidity;
    private float temperature;

    public ForecastDisplay(Observable observable){
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
        System.out.println("ForecastDisplay");
    }

}
