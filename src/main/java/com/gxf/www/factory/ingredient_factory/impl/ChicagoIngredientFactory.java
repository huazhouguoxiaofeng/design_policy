package com.gxf.www.factory.ingredient_factory.impl;

import com.gxf.www.factory.ingredient.*;
import com.gxf.www.factory.ingredient.impl.*;
import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;

/**
 * 具体原料工厂必须实现这个接口
 * 纽约版本的原材料
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(), new OnionChicago(), new Spinach(), new RedPepperChicago() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new EggPlant();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
