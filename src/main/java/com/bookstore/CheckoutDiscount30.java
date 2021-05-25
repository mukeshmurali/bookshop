package com.bookstore;

public class CheckoutDiscount30 implements CheckoutDiscount{

    private static final int TOTALAMOUNT_DISCOUNT_PERCENTAGE = 5;

    @Override
    public Double getDiscountedValue(Double price) {
            price= price - (price * TOTALAMOUNT_DISCOUNT_PERCENTAGE /100);
        return price;
    }
}
