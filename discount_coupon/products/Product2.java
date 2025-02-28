package discount_coupon.products;

public class Product2 extends IProduct {

    public Product2(final String name, final String type, final double price) {
        super(name, type, price);
    }

    public double getPrice() {
        return price;
    }
}
