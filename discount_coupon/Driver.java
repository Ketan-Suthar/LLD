package discount_coupon;

import discount_coupon.coupons.ICoupon;
import discount_coupon.coupons.PercentCoupon;
import discount_coupon.coupons.TypeCoupon;
import discount_coupon.products.IProduct;
import discount_coupon.products.Product1;

public class Driver {
    public static void main(String[] args) {
        IProduct product1 = new Product1("IPhone 14", "mobile", 1_00_000);
        ICoupon coupon1 = new TypeCoupon(new PercentCoupon(product1));

        IProduct product2 = new Product1("Rolex", "watch", 2000);
        ICoupon coupon2 = new TypeCoupon(new PercentCoupon(product2));

        System.out.println("final price of : " + coupon1.getName() + " - " + coupon1.getPrice());
        System.out.println("final price of : " + coupon2.getName() + " - " + coupon2.getPrice());
    }
}
