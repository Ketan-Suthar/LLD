package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.IState;


public class IdleState extends IState {
    @Override
    public void clickOnInsertCoin(final VendingMachine machine) throws Exception {
        machine.setState(new AcceptMoneyState());
        machine.getState().insertCoin(machine);
    }

    public String getState() {
        return "Idle State";
    }

    public void clickOnStartProductSelection(VendingMachine machine) throws Exception {
        machine.setState(new ChooseProduct());
    }
}
