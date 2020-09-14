package com.gxf.www.decorate;

import com.gxf.www.decorate.beverageImpl.DarkRoast;
import com.gxf.www.decorate.beverageImpl.Espresso;
import com.gxf.www.decorate.beverageImpl.HouseBlend;
import com.gxf.www.decorate.condimentImpl.Soy;
import com.gxf.www.decorate.condimentImpl.Whip;
import com.gxf.www.decorate.condimentImpl.Mocha;

/**
 * 装饰者模式
 */
public class DecorateMain {

    public static void main(String[] args) {
        // 订一杯 Espresso ，不需要调料，打印出她的描述与价格
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        // DarkRoast + 双倍玛卡 + whip
        Beverage beverage2 = new DarkRoast(ConstantEnum.BeverageSize.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "  $" + beverage2.cost());

        // 订单3
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "  $" + beverage3.cost());

    }

}
