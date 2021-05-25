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

    Double getTotal(Double total) {
        if (total > 30) {
            total = new Discount30().getDiscountedValue(total);
        }
        return total;
    }

    Double getDiscountedItemPrice(Item item) {
        Double total = item.getPrice();
        if (item.getYear() > DISCOUNT_PUBLISHEDYEAR) {
            total = new DiscountPublishedAfter2000().getDiscountedValue(item.getPrice());
        }
        return total;
    }
}
