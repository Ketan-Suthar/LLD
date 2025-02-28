package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.state.IState;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptMoneyState extends IState {
    public void insertCoin(VendingMachine machine) throws Exception {
        System.out.println("current amount: " + machine.getCurrentAmount());
        System.out.print("coins we accept: ");
        System.out.println(Arrays.stream(Coin.values()).map(i -> i.value).toList());
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter amount: ");
            int amt = scanner.nextInt();

            if(Coin.getCoin(amt) == null){
                System.out.println("invalid coin, please insert again.");
                return;
            }
            machine.increaseAmt(amt);
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            machine.setState(new IdleState());
        }
    }

    public String getState() {
        return "Accept Money State";
    }
}
