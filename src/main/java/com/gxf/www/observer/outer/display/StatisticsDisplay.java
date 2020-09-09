package com.gxf.www.observer.outer.display;

import com.gxf.www.observer.outer.DisplayElement;
import com.gxf.www.observer.outer.Observer;
import com.gxf.www.observer.outer.Subject;

/**
 * 此布告板跟踪最小、最大、平均值
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("统计模板");
    }

}
