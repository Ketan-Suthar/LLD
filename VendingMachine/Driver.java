package VendingMachine;

public class Driver {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.printItems();
        vendingMachine.start();
    }
}
