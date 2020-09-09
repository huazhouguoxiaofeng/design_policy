package com.gxf.www.observer.outer.display;

import com.gxf.www.observer.outer.DisplayElement;
import com.gxf.www.observer.outer.Observer;
import com.gxf.www.observer.outer.Subject;

/**
 * 此布告板根据气压计显示天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("预测模板");
    }

}
