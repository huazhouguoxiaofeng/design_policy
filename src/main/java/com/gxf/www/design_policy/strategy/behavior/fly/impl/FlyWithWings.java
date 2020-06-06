package com.gxf.www.design_policy.strategy.behavior.fly.impl;


import com.gxf.www.design_policy.strategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("实现鸭子飞行");
    }

}
