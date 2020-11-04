package com.gxf.www.abstract_factory.product.impl;

import com.gxf.www.abstract_factory.product.AbstractYellowHuman;

public class YellowFemaleHuman extends AbstractYellowHuman {
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
