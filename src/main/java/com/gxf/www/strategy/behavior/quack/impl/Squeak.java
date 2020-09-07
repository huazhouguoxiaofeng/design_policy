package com.gxf.www.strategy.behavior.quack.impl;


import com.gxf.www.strategy.behavior.quack.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子吱吱叫");
    }
}
