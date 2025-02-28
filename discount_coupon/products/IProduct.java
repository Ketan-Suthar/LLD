package discount_coupon.products;

public abstract class IProduct {
    protected String name;
    protected String type;
    protected double price;

    public IProduct() {}

    public IProduct(final String n, final String t, final double p) {
        name = n;
        type = t;
        price = p;
    }

    public abstract double getPrice();

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
