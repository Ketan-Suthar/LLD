package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.Item;
import VendingMachine.state.IState;

import java.util.Arrays;
import java.util.Scanner;

public class ChooseProduct extends IState {
    public Item selectProduct(final VendingMachine machine) throws Exception {
        if(machine.getCurrentAmount() <= 0) {
            System.out.println("Please insert coin first.");
            machine.setState(new IdleState());
            return null;
        }

        System.out.print("enter code: ");
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine();
        final var itemToDispense = machine.getItem(op);
        if(itemToDispense == null) {
            System.out.println("invalid code, please select again");
            selectProduct(machine);
        }else {
            machine.setState(new DispenseProduct());
        }
        return itemToDispense;
    }

    public String getState() {
        return "Choose Product State";
    }
}
