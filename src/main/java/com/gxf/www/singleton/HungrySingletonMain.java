package com.gxf.www.singleton;

public class HungrySingletonMain {

    public static void main(String[] args) {
        final EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        final EagerSingleton eagerSingleton02 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        System.out.println(eagerSingleton02 == eagerSingleton);
    }

}
