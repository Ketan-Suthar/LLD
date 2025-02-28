package discount_coupon.coupons;

import discount_coupon.products.IProduct;

public class TypeCoupon extends ICoupon {
    public TypeCoupon(final IProduct product) {
        super(product);
    }

    public double getPrice() {
        System.out.println("inside TypeCoupon::getPrice");
        if("mobile".equalsIgnoreCase(product.getType()))
            return product.getPrice() * 0.80;
        return product.getPrice();
    }
}
