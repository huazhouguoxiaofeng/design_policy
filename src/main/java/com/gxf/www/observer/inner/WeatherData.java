package com.gxf.www.observer.inner;

import java.util.Observable;

/**
 * Observable 可观察的，就是主题嘛，相当于 outer 那里的 subject
 * 注册、删除、通知观察者，已经由父类 Observable 里面的实现了哦，好叼
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 我们的构造器不需要为记住观察者而建立数据构造了？？为什么？？？
     */
    public WeatherData(){

    };

    /**
     * setChanged()方法可以让你在更新观察者时，有更多的弹性，你可以更适当地通知观察者。
     * 比方说，如果没有setChanged()方法，我们的气象站测量是如此敏锐，以致于温度计读数每十分之一度就会更新，
     * 这会造成WeatherData对象持续不断地通知观察者，我们并不希望看到这样的事情发生。
     * 如果我们希望半度以上才更新，就可以在温度差距到达半度时，调用setChanged()，进行有效的更新。
     *
     * 我们并没有调用 notifyObservers() 方法传送数据对象，这表示我们用的是 拉 做法
     *
     */
    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure ){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 观察者会利用这些方法取得  WeatherData 对象的状态
     * @return
     */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
