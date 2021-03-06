package com.gxf.www.strategy.duck;


import com.gxf.www.strategy.behavior.fly.impl.FlyNoWay;
import com.gxf.www.strategy.behavior.quack.impl.Quack;

/**
 * 模型鸭子:
 * 呱呱叫
 * 用翅膀飞
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("模型鸭子");
    }

}
