package com.gxf.www.decorate.condimentImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.CondimentDecorator;

/**
 * 调料实现: 摩卡
 * 装饰者实现：每个装饰者都有一个包装实现 Beverage
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

}
