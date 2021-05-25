package com.bookstore;

public class DiscountFactory {
    public static final int DISCOUNT_PUBLISHEDYEAR = 2000;
    private static DiscountFactory discountFactory;

    private DiscountFactory() {
    }

    public static DiscountFactory getInstance() {
        if (discountFactory == null) {
            discountFactory = new DiscountFactory();
        }
        return discountFactory;
    }

    Discount createDiscount(Double total){
        Discount discount = null;
        if (total > 30)
            discount=new Discount30();
        else
            discount=new Discount0();
        return discount;
    }

    Discount createDiscount(Item item){
        Discount discount = null;
        if (item.getYear() > DISCOUNT_PUBLISHEDYEAR)
            discount=new DiscountPublishedAfter2000();
        else
            discount=new Discount0();
        return discount;
    }
}
