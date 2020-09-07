package com.gxf.www.strategy.behavior.fly.impl;


import com.gxf.www.strategy.behavior.fly.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("火箭动力的飞行行为");
    }
}
