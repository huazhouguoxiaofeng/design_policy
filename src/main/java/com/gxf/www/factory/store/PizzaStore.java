package com.gxf.www.factory.store;

import com.gxf.www.factory.pizza.Pizza;

/**
 * 通过这里下单
 * PizzaStore 通过 SimplePizzaFactory 取得实例
 * 创建者类，以及其子类
 */
public abstract class PizzaStore {

    /**
     * 抽象出创建Pizza的工厂方法，由子类实现该方法并创建具体的Pizza
     * 这个正是工厂方法
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
