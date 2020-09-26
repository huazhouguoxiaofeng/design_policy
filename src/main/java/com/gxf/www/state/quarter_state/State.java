package com.gxf.www.state.quarter_state;

/**
 * 状态接口
 */
public interface State {

    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退回25分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();

    /**
     * 充值
     */
    void refill();
    
}