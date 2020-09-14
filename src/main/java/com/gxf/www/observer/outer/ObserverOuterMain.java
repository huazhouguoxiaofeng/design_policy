package com.gxf.www.observer.outer;

import com.gxf.www.observer.outer.Impl.WeatherData;
import com.gxf.www.observer.outer.display.CurrentConditionDisplay;
import com.gxf.www.observer.outer.display.ForecastDisplay;
import com.gxf.www.observer.outer.display.StatisticsDisplay;

/**
 * 用户可随心所欲地删除布告板
 * 一：我们的 WeatherData 类
 * 多：我们的布告板
 * 观测值改变时，必须通知所有的布告板，好让他们各自做出处理
 *
 * 自定义观察者模式
 *
 */
public class ObserverOuterMain {
    public static void main(String[] args) {
        /**
         * 这个就是主题嘛，构造主题，观察者的集合不断变化
         * 注册到主题的话，就遍历通知 notifyObservers()
         */
        WeatherData weatherData = new WeatherData();
        /**
         * 各个观察者不断注册主题注册主题、
         * 每一个构造方法就是往主题集合里面放观察者
         */
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        /**
         * 主题数值不断变化
         */
        weatherData.setMeasurements(80,65,30.0f);
        weatherData.setMeasurements(82,70,29.2f);

        System.out.println("***去掉统计了***");

        weatherData.removeObserver(statisticsDisplay);
        weatherData.setMeasurements(78,90,28.3f);
    }
}
