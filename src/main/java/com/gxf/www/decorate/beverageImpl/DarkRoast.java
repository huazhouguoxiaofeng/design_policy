package com.gxf.www.decorate.beverageImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.ConstantEnum;

/**
 * 饮料实现：深焙咖啡
 * 曰：组件实现
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        this(ConstantEnum.BeverageSize.VENTI);
    }

    public DarkRoast(ConstantEnum.BeverageSize beverageSize){
        description = "DarkRoastCoffee";
        this.beverageSize = beverageSize;
    }

    @Override
    public double cost() {
        final ConstantEnum.BeverageSize size = this.getSize();
        switch (size){
            case TALL:
                return 1.2;
            case GRANDE:
                return 2.2;
            case VENTI:
                return 3.2;
            default:
                throw new IllegalArgumentException(String.valueOf(size));
        }
    }
}