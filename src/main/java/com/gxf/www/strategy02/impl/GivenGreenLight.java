package com.gxf.www.strategy02.impl;

import com.gxf.www.strategy02.IStrategy;

public class GivenGreenLight implements IStrategy {
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行！");
    }
}
