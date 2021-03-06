package com.gxf.www.observer.outer.display;

import com.gxf.www.observer.outer.DisplayElement;
import com.gxf.www.observer.outer.Observer;
import com.gxf.www.observer.outer.Subject;

/**
 * 此布告板显示当前值
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 把最近的温度和湿度显示出来
     */
    @Override
    public void display() {
        System.out.println("current temperature: " + temperature + ", humidity=" + humidity + '}');
    }

    /**
     * 当update方法被调用时，我们把温度和湿度保存起来，然后调用display方法
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

}
