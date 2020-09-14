package com.gxf.www.decorate;

/**
 * 抽象饮料类
 * 抽象组件
 */
public abstract class Beverage {

    protected ConstantEnum.BeverageSize beverageSize;

    public String description = "Unknown Beverage";

    public String getDescription(){
        return beverageSize.name + " " + description;
    }

    public ConstantEnum.BeverageSize getSize(){
        return beverageSize;
    }

    public abstract double cost();

}
