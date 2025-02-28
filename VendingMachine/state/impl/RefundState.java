package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.IState;

public class RefundState extends IState {

    public void refundRemainingMoney(VendingMachine machine) throws Exception {
        if(machine.getCurrentAmount() == 0) {
            System.out.println("No money to refund.");
            return;
        }
        System.out.println("Take your " + machine.getCurrentAmount() + " RS. back.");
        machine.decreaseAmt(machine.getCurrentAmount());
        machine.setState(new IdleState());
    }

    public void clickOnStartProductSelection(VendingMachine machine) throws Exception {
        machine.setState(new ChooseProduct());
    }

    public String getState() {
        return "Refund State";
    }
}
