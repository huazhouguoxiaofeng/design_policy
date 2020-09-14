package com.gxf.www.strategy;

import com.gxf.www.strategy.behavior.fly.impl.FlyRocketPowered;
import com.gxf.www.strategy.duck.Duck;
import com.gxf.www.strategy.duck.ModelDuck;

/**
 * 策略模式
 */
public class StrategyMain {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
