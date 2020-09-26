package com.gxf.www.state.quarter_state.impl;

import com.gxf.www.state.GumballMachine;
import com.gxf.www.state.quarter_state.State;

import java.util.Random;

public class HasQuarterState implements State {

    /**
     * 随机数产生器
     */
    Random randomWinner = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
//        gumballMachine.setState(gumballMachine.getSoldState());
        /*
         * 顾客有10%几率获胜
         * 获胜：进入认识赢家状态
         * 未获胜：进入售出状态
         */
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill() { }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
