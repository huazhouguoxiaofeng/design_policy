package com.gxf.www.decorate.beverageImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.ConstantEnum;

/**
 * 饮料实现：浓缩咖啡
 * 曰：组件实现
 */
public class Espresso extends Beverage {

    public Espresso(){
        this(ConstantEnum.BeverageSize.GRANDE);
    }

    public Espresso(ConstantEnum.BeverageSize beverageSize){
        this.description = "EspressoCoffee";
        this.beverageSize = beverageSize;
    }

    @Override
    public double cost() {
        final ConstantEnum.BeverageSize size = this.getSize();
        switch (size){
            case TALL:
                return 1.1;
            case GRANDE:
                return 2.1;
            case VENTI:
                return 3.1;
            default:
                throw new IllegalArgumentException(String.valueOf(size));
        }
    }

}
