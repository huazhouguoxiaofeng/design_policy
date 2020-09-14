package com.gxf.www.decorate.condimentImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.CondimentDecorator;

/**
 * 调料实现：
 * 装饰者实现：每个装饰者都有一个包装实现 Beverage
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        switch (this.getSize()){
            case TALL:
                return cost += 0.10;
            case GRANDE:
                return cost += 0.15;
            case VENTI:
                return cost += 0.20;
            default:
                return cost;
        }
    }

}
