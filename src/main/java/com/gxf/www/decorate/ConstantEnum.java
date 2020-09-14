package com.gxf.www.decorate;

public interface ConstantEnum {


    enum BeverageSize{

        TALL(1, "小杯"),
        GRANDE(2, "中杯"),
        VENTI(3, "大杯");

        Integer id;
        String name;


        BeverageSize(Integer id, String name){
            this.id = id;
            this.name = name;
        }

    }

}
