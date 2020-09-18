package com.gxf.www.factory.store.impl;

import com.gxf.www.factory.ingredient_factory.impl.NYPizzaIngredientFactory;
import com.gxf.www.factory.pizza.Pizza;
import com.gxf.www.factory.ingredient_factory.PizzaIngredientFactory;
import com.gxf.www.factory.pizza.impl.CheesePizza;
import com.gxf.www.factory.pizza.impl.ClamPizza;
import com.gxf.www.factory.pizza.impl.PepperoniPizza;
import com.gxf.www.factory.pizza.impl.VeggiePizza;
import com.gxf.www.factory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory= new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("new york style cheese pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("new york style veggie pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("new york style clam pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("new york style pepperoni pizza");
                break;
            default:
        }
        return pizza;
    }
}
