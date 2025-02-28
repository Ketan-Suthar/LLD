package discount_coupon.products;

public class Product1 extends IProduct {

    public Product1(final String name, final String type, final double price) {
        super(name, type, price);
    }

    public double getPrice() {
        return price;
    }
}
