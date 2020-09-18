package com.gxf.www.factory.pizza.impl;

import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;
import com.gxf.www.factory.pizza.Pizza;

/**
 * 奶酪比萨
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    /**
     * 制作Pizza需要工厂提供原材料
     * 具体的原材料由子类提供
     * @param ingredientFactory
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory =ingredientFactory;
    }

    /**
     * 每当需要原材料时，就跟工厂要
     */
    @Override
    public void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
