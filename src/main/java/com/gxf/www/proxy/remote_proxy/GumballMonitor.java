package com.gxf.www.proxy.remote_proxy;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote machine;
    public GumballMonitor(GumballMachineRemote machine) {//我们依赖于远程接口
        this.machine = machine;
    }
    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {//对可能产生的网络异常进行捕获和处理
            e.printStackTrace();
        }
    }
}
