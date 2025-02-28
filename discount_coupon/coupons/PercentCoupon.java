package discount_coupon.coupons;

import discount_coupon.products.IProduct;

public class PercentCoupon extends ICoupon {
    public PercentCoupon(final IProduct product) {
        super(product);
    }

    public double getPrice() {
        System.out.println("inside PercentCoupon::getPrice");
        return product.getPrice() * 0.90;
    }
}
