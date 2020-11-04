package com.gxf.www.abstract_factory.factory.impl;

import com.gxf.www.abstract_factory.factory.AbstractHumanFactory;
import com.gxf.www.abstract_factory.product.Human;
import com.gxf.www.abstract_factory.product.HumanEnum;

public class MaleHumanFactory extends AbstractHumanFactory {
    //创建一个男性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
    //创建一个男性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }
    //创建一个男性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }
}
