package com.gxf.www.state;

@Deprecated
public class GumballMachineOld {

    /**
     * 售空
     */
    final static int SOLD_OUT = 0;
    /**
     * 无硬币
     */
    final static int NO_QUARTER = 1;
    /**
     * 有硬币
     */
    final static int HAS_QUARTER = 2;
    /**
     * 售出
     */
    final static int SOLD = 3;

    /**
     *  糖果机目前所处的状态，初始时默认为无糖果的状态
     */
    int state = SOLD_OUT;
    int count = 0;

    public GumballMachineOld(int count){
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    /**
     * 投入硬币
     */
    public void insertQuarter() {
        switch (state){
            case HAS_QUARTER:
                System.out.println("You can't insert another quarter");
                break;
            case NO_QUARTER:
                System.out.println("You inserted a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter, the machine is sold out");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
            default:
        }
    }

    /**
     * 退回硬币
     */
    public void ejectQuarter() {
        switch (state){
            case HAS_QUARTER:
                System.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter");
                break;
            case SOLD_OUT:
                System.out.println("Sorry, you already turned the crank");
                break;
            case SOLD:
                System.out.println("You can't eject, you haven't inserted a quarter yet");
                break;
            default:
        }
    }

    /**
     * 转动曲柄
     */
    public void turnCrank() {
        switch (state){
            case HAS_QUARTER:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
            case NO_QUARTER:
                System.out.println("You turned but there's no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case SOLD:
                System.out.println("You turned...");
                state = SOLD;
                dispense();
                break;
            default:
        }
    }

    /**
     * 发放糖果
     */
    private void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count = count - 1;
            if (count == 0) {
                System.out.println("Oops, out of gumballs!");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    //----------------------其他方法----------------------
    //充值
    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");

        switch (state){
            case HAS_QUARTER:
                result.append("waiting for turn of crank");
                break;
            case NO_QUARTER:
                result.append("waiting for quarter");
                break;
            case SOLD_OUT:
                result.append("sold out");
                break;
            case SOLD:
                result.append("delivering a gumball");
                break;
            default:
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        GumballMachineOld gumballMachineOld = new GumballMachineOld(5);

        System.out.println(gumballMachineOld);

        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();

        System.out.println(gumballMachineOld);

        gumballMachineOld.insertQuarter();
        gumballMachineOld.ejectQuarter();
        gumballMachineOld.turnCrank();

        System.out.println(gumballMachineOld);

        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();
        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();
        gumballMachineOld.ejectQuarter();

        System.out.println(gumballMachineOld);

        gumballMachineOld.insertQuarter();
        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();
        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();
        gumballMachineOld.insertQuarter();
        gumballMachineOld.turnCrank();

        System.out.println(gumballMachineOld);
    }

}
