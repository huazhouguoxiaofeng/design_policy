package com.gxf.www.observer.outer;

/**
 * 主题接口：
 * 具体主题来实现这个接口
 * 对主题来说，就是注册观察者、移除观察者、通知观察者嘛
 */
public interface Subject {

    /**
     * 这两个方法都需要一个观察者作为变量，该观察者是用来注册或者被删除的
     * @param o
     */
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    /**
     * 当主题改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObservers();
}
