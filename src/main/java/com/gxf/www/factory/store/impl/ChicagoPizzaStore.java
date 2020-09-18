package com.gxf.www.factory.store.impl;

import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;
import com.gxf.www.factory.ingredient_factory.impl.ChicagoIngredientFactory;
import com.gxf.www.factory.ingredient_factory.impl.NYPizzaIngredientFactory;
import com.gxf.www.factory.pizza.Pizza;
import com.gxf.www.factory.pizza.impl.CheesePizza;
import com.gxf.www.factory.pizza.impl.ClamPizza;
import com.gxf.www.factory.pizza.impl.PepperoniPizza;
import com.gxf.www.factory.pizza.impl.VeggiePizza;
import com.gxf.www.factory.store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory= new ChicagoIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                break;
            default:
        }
        return pizza;
    }
}
