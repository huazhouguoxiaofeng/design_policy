package com.gxf.www.proxy.remote_proxy;

import com.gxf.www.proxy.remote_proxy.quarter_state.State;
import com.gxf.www.proxy.remote_proxy.quarter_state.impl.HasQuarterState;
import com.gxf.www.proxy.remote_proxy.quarter_state.impl.NoQuarterState;
import com.gxf.www.proxy.remote_proxy.quarter_state.impl.SoldOutState;
import com.gxf.www.proxy.remote_proxy.quarter_state.impl.SoldState;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State state = soldOutState;
    int count = 0;
    String location;

    /**
     * 构造器需要抛出RemoteException，因为超类是这么做的
     * @param location
     * @param numberGumballs
     * @throws RemoteException
     */
    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
        this.location = location;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public String getLocation() {
        return location;
    }
    //其他方法
}