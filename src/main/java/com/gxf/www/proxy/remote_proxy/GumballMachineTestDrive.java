package com.gxf.www.proxy.remote_proxy;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

//        Naming.bind("rmi://localhost:8888/RHello", rhello);
        // Naming.bind("//localhost:8888/RHello",rhello);
//        seattle.mightygumball.com
        GumballMachineRemote gumballMachine = null;
        int count;

        if (args.length < 2) {
            System.out.println("GumballMachine ");
            System.exit(1);
        }

        try {
            final String url = args[0];
            count = Integer.parseInt(args[1]);
            System.out.println("url: " + url);
            System.out.println("count: " + count);
            gumballMachine = new GumballMachine(url, count);
            String finalUrl = "rmi//" + url + "/gumballmachine";
            System.out.println(finalUrl);
            LocateRegistry.createRegistry(8888);
            Naming.rebind(finalUrl, gumballMachine);
            System.out.println("服务器启动成功。。。。。。。。。。。。。。");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
