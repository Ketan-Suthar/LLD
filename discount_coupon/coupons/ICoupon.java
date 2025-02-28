package discount_coupon.coupons;

import discount_coupon.products.IProduct;

public abstract class ICoupon extends CouponDecorator {
    protected final IProduct product;

    public ICoupon(final IProduct product) {
        this.product = product;
    }

    public abstract double getPrice();

    public String getName() {
        return product.getName();
    }

    public String getType() {
        return product.getType();
    }
}
