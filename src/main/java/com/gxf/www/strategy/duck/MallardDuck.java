package com.gxf.www.strategy.duck;


import com.gxf.www.strategy.behavior.fly.impl.FlyWithWings;
import com.gxf.www.strategy.behavior.quack.impl.Quack;

/**
 * 绿头鸭:
 * 呱呱叫
 * 用翅膀飞
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }

}
