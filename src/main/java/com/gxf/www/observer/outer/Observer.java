package com.gxf.www.observer.outer;

/**
 * 观察者接口：
 * 具体观察者来实现这个接口
 * 对观察者来说，就是更新信息嘛
 */
public interface Observer {
    /**
     * 当气象观测值改变时，主题会把这些状态值作为方法的参数，传送给观察者
     * 所有的观察者都必须实现update()方法，以实现观察者接口
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
