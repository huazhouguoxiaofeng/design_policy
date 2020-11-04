package com.gxf.www.abstract_factory.factory.impl;

import com.gxf.www.abstract_factory.factory.AbstractHumanFactory;
import com.gxf.www.abstract_factory.product.Human;
import com.gxf.www.abstract_factory.product.HumanEnum;

public class FemaleHumanFactory extends AbstractHumanFactory {
    //创建一个女性黑种人
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
    //创建一个女性白种人
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }
    //创建一个女性黄种人
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }
}
