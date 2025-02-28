package VendingMachine;

public record Item(String name, int code, int price) {

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }
}
