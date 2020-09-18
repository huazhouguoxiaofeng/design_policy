package com.gxf.www.factory;

import com.gxf.www.factory.pizza.Pizza;
import com.gxf.www.factory.store.impl.ChicagoPizzaStore;
import com.gxf.www.factory.store.impl.NYPizzaStore;
import com.gxf.www.factory.store.PizzaStore;

/**
 * 简单工厂和工厂方法之间的差异？
 * 简单工厂是在一个地方把所有的事都处理完了，然而工厂方法却是创建一个框架，让子类决定要如何实现。简单工厂的做法，
 * 可以将对象的创建封装起来，但是简单工厂不具备工厂方法的弹性，因为简单工厂不能变更正在创建的产品。
 *
 * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类
 *
 */
public class FactoryMain {
    public static void main(String[] args) {
        final PizzaStore nyPizzaStore = new NYPizzaStore();
        final PizzaStore chicagoStylePizzaStore = new ChicagoPizzaStore();
        final Pizza veggie = nyPizzaStore.orderPizza("veggie");
        System.out.println(veggie);
        final Pizza cheese = chicagoStylePizzaStore.orderPizza("cheese");
        System.out.println(cheese);
    }
}
