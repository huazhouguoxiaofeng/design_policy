package com.gxf.www.abstract_factory.product.impl;

import com.gxf.www.abstract_factory.product.AbstractWhiteHuman;

public class WhiteFemaleHuman extends AbstractWhiteHuman {
    public void sex() {
        System.out.println("该白种人的性别为女....");
    }
}
