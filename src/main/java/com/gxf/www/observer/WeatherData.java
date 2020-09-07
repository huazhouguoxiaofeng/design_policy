package com.gxf.www.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    /**
     * 我们加上一个集合来记录观察者，此集合是在构造器中建立的
     */
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        final int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure ){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObservers();
    }

}
