package com.gxf.www.decorate.beverageImpl;

import com.gxf.www.decorate.Beverage;
import com.gxf.www.decorate.ConstantEnum;

/**
 * 饮料实现：首选咖啡
 * 曰：组件实现
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        this(ConstantEnum.BeverageSize.GRANDE);
    }

    public HouseBlend(ConstantEnum.BeverageSize beverageSize){
        description = "House Blend Coffee";
        this.beverageSize = beverageSize;
    }

    @Override
    public double cost() {
        final ConstantEnum.BeverageSize size = this.getSize();
        switch (size){
            case TALL:
                return 1.3;
            case GRANDE:
                return 2.3;
            case VENTI:
                return 3.3;
            default:
                throw new IllegalArgumentException(String.valueOf(size));
        }
    }
}
