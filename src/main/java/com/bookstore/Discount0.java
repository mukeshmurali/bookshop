package com.bookstore;

public class Discount0 implements Discount {

    private static final int TOTALAMOUNT_DISCOUNT_PERCENTAGE = 5;

    @Override
    public Double getDiscountedValue(Double price) {
        return price;
    }
}
