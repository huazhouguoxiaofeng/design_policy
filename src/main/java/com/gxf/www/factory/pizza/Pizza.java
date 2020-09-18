package com.gxf.www.factory.pizza;

import com.gxf.www.factory.ingredient.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，以及其子类
 * 每个pizza的各种原材料是不一样的，每种原材料由不同的子类实现
 */
@Data
public abstract class Pizza{

    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public List<Object> toppings = new ArrayList<>();

    /**
     * 把 Prepare（）方法声明成抽象，在这个方法中，我们需要收集Pizza所需的原材料，而这些原材料来自原料工厂。
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

}
