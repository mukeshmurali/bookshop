package com.bookstore;

public class Discount30 implements Discount {

    private static final int TOTALAMOUNT_DISCOUNT_PERCENTAGE = 5;

    @Override
    public Double getDiscountedValue(Double price) {
        price = price - (price * TOTALAMOUNT_DISCOUNT_PERCENTAGE / 100);
        return price;
    }
}
