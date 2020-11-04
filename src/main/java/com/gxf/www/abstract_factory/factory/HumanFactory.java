package com.gxf.www.abstract_factory.factory;

import com.gxf.www.abstract_factory.product.Human;

public interface HumanFactory {

    //制造黄色人类
    Human createYellowHuman();

    //制造一个白色人类
    Human createWhiteHuman();

    //制造一个黑色人类
    Human createBlackHuman();
}