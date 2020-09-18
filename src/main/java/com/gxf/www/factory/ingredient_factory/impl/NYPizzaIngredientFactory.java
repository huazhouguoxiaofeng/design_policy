package com.gxf.www.factory.ingredient_factory.impl;

import com.gxf.www.factory.ingredient.*;
import com.gxf.www.factory.ingredient.impl.*;
import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;

/**
 * 具体原料工厂必须实现这个接口
 * 纽约版本的原材料
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
