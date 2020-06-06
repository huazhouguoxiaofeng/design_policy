package com.gxf.www.design_policy.strategy;

import com.gxf.www.design_policy.strategy.behavior.fly.impl.FlyRocketPowered;
import com.gxf.www.design_policy.strategy.duck.Duck;
import com.gxf.www.design_policy.strategy.duck.ModelDuck;

public class StrategyMain {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
