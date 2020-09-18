package com.gxf.www.factory.pizza.impl;

import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;
import com.gxf.www.factory.pizza.Pizza;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    /**
     * 制作Pizza需要工厂提供原材料
     * 具体的原材料由子类提供
     * @param ingredientFactory
     */
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory =ingredientFactory;
    }

    /**
     * 每当需要原材料时，就跟工厂要
     * 纽约工厂使用新鲜的 蛤蜊，芝加哥使用冷冻的蛤蜊
     */
    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

}
