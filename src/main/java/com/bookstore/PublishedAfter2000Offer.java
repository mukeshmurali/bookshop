package com.bookstore;

public class PublishedAfter2000Offer implements Discount {

    public static final int DISCOUNT_POST_2000 = 10;

    @Override
    public Double getDiscountedValue(Double price) {
        price = price - (price * DISCOUNT_POST_2000 / 100);
        return price;
    }
}
