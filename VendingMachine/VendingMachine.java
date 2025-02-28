package VendingMachine;

import VendingMachine.state.IState;
import VendingMachine.state.impl.IdleState;

import java.util.*;

public class VendingMachine {
    private final Map<String, List<Item>> items;
    private IState state;
    private int currentAmt = 0;
    private Item itemToDispense;

    VendingMachine() {
        items = new HashMap<>();
        intiItems();
        currentAmt = 0;
        state = new IdleState();
    }

    public void setState(final IState state) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }

    public int getCurrentAmount() {
        return currentAmt;
    }

    public void increaseAmt(final int amt) {
        if(amt < 0) {
            System.out.println("Can not accept negative amount!!");
            return;
        }
        currentAmt += amt;
        System.out.println("current amount: " + currentAmt);
    }

    public void decreaseAmt(final int amt) {
        if(amt > currentAmt) {
            System.out.println("Invalid amount.");
            return;
        }
        currentAmt -= amt;
        System.out.println("current amount: " + currentAmt);
    }

    private void intiItems() {
        items.put("Cokes", List.of(new Item("101", 101, 10),
                new Item("101", 102, 5),
                new Item("102", 103, 20),
                new Item("104", 104, 25)));

        items.put("Amul", List.of(new Item("201", 201, 5),
                new Item("201", 202, 15),
                new Item("202", 203, 30),
                new Item("204", 204, 55)));

        items.put("Lays", List.of(new Item("301", 301, 100),
                new Item("301", 302, 110),
                new Item("302", 303, 220),
                new Item("304", 304, 132)));
    }

    void printItems() {
        for(final var key: items.keySet()) {
            System.out.println();
            System.out.println(key.toUpperCase() + ": ");
            for(final var item: items.get(key)) {
                System.out.print(item.code() + " - " + item.price() + " | ");
            }
            System.out.println();
        }
    }

    public void start() throws Exception {
        System.out.println("\n\nPlease select option from below");
        while(true) {
            System.out.println("1. insert coin");
            System.out.println("2. choose product");
            System.out.println("3. dispense product");
            System.out.println("4. Refund");
            Scanner myObj = new Scanner(System.in);
            System.out.print("Enter option number: ");
            final var op = myObj.nextLine();
            try{
                performOp(op);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    private void performOp(final String op) throws Exception {
        if("1".equals(op)) {
            state.clickOnInsertCoin(this);
        }else if("2".equals(op)){
            state.clickOnStartProductSelection(this);
            itemToDispense = state.selectProduct(this);
        }else if("3".equals(op)){
            state.dispenseProduct(this, itemToDispense);
            itemToDispense = null;
        }else if("4".equals(op)){
            state.refundRemainingMoney(this);
        }
    }

    public Item getItem(final String code) {
        for(final var key: items.keySet()) {
            for(final var item: items.get(key)) {
                if(item.name().equals(code))
                    return item;
            }
        }
        return null;
    }
}
