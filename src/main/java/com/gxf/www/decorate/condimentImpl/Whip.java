package com.gxf.www.decorate.condimentImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.CondimentDecorator;

/**
 * 调料实现：奶泡
 * 装饰者实现：每个装饰者都有一个包装实现 Beverage
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }

}
