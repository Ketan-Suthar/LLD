package VendingMachine.state;

import VendingMachine.VendingMachine;
import VendingMachine.Coin;
import VendingMachine.Item;

import java.util.List;

public abstract class IState {

    public abstract String getState();

    private String getExceptionMessage() {
        return "Can not perform operation in " + getState();
    }

    public void clickOnInsertCoin(VendingMachine machine) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void clickOnStartProductSelection(VendingMachine machine) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void insertCoin(VendingMachine machine) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public Item selectProduct(VendingMachine machine) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public int getChange(int returnAmt) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void dispenseProduct(VendingMachine machine, int code) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void dispenseProduct(VendingMachine machine, Item item) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void refundRemainingMoney(VendingMachine machine) throws Exception {
        throw new Exception(getExceptionMessage());
    }

    public void addInventory(VendingMachine machine, Item item) throws Exception {
        throw new Exception(getExceptionMessage());
    }
}
