package VendingMachine.state.impl;

import VendingMachine.Item;
import VendingMachine.VendingMachine;
import VendingMachine.state.IState;

public class DispenseProduct extends IState {
    @Override
    public void dispenseProduct(VendingMachine machine, Item item) throws Exception {
        if(item == null) {
            System.out.println("Please select product first.");
            return;
        }

        if(item.price() > machine.getCurrentAmount()) {
            System.out.println("Please insert sufficient money first.");
            return;
        }

        System.out.println("Dispensing product: " + item);
        if(item.price() == machine.getCurrentAmount()) {
            System.out.println("All your money is used.");
            machine.setState(new IdleState());
        }
        else{
            System.out.println("Click on refund button to get remaking money back or choose new product.");
            machine.decreaseAmt(item.price());
            machine.setState(new RefundState());
        }
    }

    public String getState() {
        return "Dispense State";
    }
}
