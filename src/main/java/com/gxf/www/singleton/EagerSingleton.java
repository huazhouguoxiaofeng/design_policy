package com.gxf.www.singleton;

public class EagerSingleton {

    private static final EagerSingleton EAGER_SINGLETON = new EagerSingleton();

    /**
     * 外界不能实例化
     */
    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return EAGER_SINGLETON;
    }

}
