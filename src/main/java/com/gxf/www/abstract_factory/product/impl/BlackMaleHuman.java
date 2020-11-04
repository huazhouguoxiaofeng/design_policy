package com.gxf.www.abstract_factory.product.impl;

import com.gxf.www.abstract_factory.product.AbstractBlackHuman;

public class BlackMaleHuman extends AbstractBlackHuman {
    public void sex() {
        System.out.println("该黑种人的性别为男...");
    }
}
