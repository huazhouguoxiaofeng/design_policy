package com.gxf.www.state.quarter_state.impl;

import com.gxf.www.state.GumballMachine;
import com.gxf.www.state.quarter_state.State;

public class NoQuarterState implements State {

    /**
     * 糖果机
     */
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        //在"没有硬币"的状态下，投入硬币，糖果机设置新状态为"有硬币"
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() { }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
