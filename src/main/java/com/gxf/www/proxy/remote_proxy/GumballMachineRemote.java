package com.gxf.www.proxy.remote_proxy;

import com.gxf.www.proxy.remote_proxy.quarter_state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 必须扩展java.rmi.Remote
 * 准备支持的方法必须抛出RemoteException
 * 这个是对RMI有规定意义的，请遵循。
 */
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
    //所有返回类型必须是原语类型或可序列化类型
}