package com.gxf.www.factory;

import com.gxf.www.factory.pizza.impl.CheesePizza;
import com.gxf.www.factory.pizza.impl.ClamPizza;
import com.gxf.www.factory.pizza.impl.VeggiePizza;
import com.gxf.www.factory.pizza.Pizza;

/**
 * 独立：
 * 简单工厂模式：耦合性很强
 */
@Deprecated
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
        } else if (type.equals("clam")){
//            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
//            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
