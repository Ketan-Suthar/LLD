package VendingMachine.state.impl;

import VendingMachine.VendingMachine;
import VendingMachine.state.IState;

public class ClickOnInsertCoinState extends IState {
    @Override
    public void clickOnInsertCoin(final VendingMachine machine) throws Exception {
        machine.setState(new AcceptMoneyState());
        machine.getState().insertCoin(machine);
    }

    public void clickOnStartProductSelection(VendingMachine machine) throws Exception {
        machine.setState(new ChooseProduct());
    }

    public String getState() {
        return "Insert Coin State";
    }
}
