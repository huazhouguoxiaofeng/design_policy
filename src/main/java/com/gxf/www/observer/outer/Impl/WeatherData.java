package com.gxf.www.observer.outer.Impl;

import com.gxf.www.observer.outer.Observer;
import com.gxf.www.observer.outer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个就是主题的具体实现
 */
public class WeatherData implements Subject {

    /**
     * 我们加上一个集合来记录观察者，此集合是在构造器中建立的
     * 集合里面放的是一个个 Observer 的实现类
     */
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 构造主题的时候，立刻构造一个空参哦，叼
     */
    public WeatherData(){
        observers = new ArrayList<>();
    }

    /**
     * o 就是指：CurrentConditionDisplay、ForecastDisplay、StatisticsDisplay 一个个对象
     * 这里就是把一个个对象放进集合里面了
     * @param o
     */
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

    /**
     * 注册到主题的话，就遍历通知，原来是这样
     * observer 是个接口，必须由他的实现类来实现哦：CurrentConditionDisplay、ForecastDisplay、StatisticsDisplay
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 一旦天气值更新，此方法就会被调用，measurementsChanged()方法也会被调用，就是main方法调用这个东东嘛
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure ){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    /**
     * 一旦气象测量更新，此方法会被调用
     */
    private void measurementsChanged() {
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "observers=" + observers +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
