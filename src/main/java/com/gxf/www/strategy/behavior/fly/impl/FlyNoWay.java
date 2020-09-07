package com.gxf.www.strategy.behavior.fly.impl;


import com.gxf.www.strategy.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("什么都不做，不会飞");
    }
}
