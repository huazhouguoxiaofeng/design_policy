package com.gxf.www.singleton;

public class LazySingleton {

    private static volatile LazySingleton lazySingleton;

    /**
     * 外界不能实例化
     */
    private LazySingleton(){

    }

    public LazySingleton getLazySingleton(){
        if (lazySingleton == null) {
            synchronized (LazySingleton.class){
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
