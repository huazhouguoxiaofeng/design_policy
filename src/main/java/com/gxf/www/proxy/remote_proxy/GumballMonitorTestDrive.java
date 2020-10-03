package com.gxf.www.proxy.remote_proxy;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://seattle.mightygumball.com/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];
        for (int i=0;i < location.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup("rmi://localhost:8888/RHello");
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for(int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}