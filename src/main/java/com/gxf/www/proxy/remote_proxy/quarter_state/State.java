package com.gxf.www.proxy.remote_proxy.quarter_state;

import java.io.Serializable;

/**
 * @author xiaofeng
 * 扩展Serializable接囗，实现序列化，这样所有子类中的State就可以在网络上传送了
 */
public interface State extends Serializable {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

}
