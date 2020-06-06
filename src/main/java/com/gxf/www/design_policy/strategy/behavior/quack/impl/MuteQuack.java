package com.gxf.www.design_policy.strategy.behavior.quack.impl;


import com.gxf.www.design_policy.strategy.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不做，不会叫");
    }
}
