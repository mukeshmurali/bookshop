package com.bookstore;

public class ItemOnOffer extends ItemDecorator {

    public static final int DISCOUNT_POST_2000 = 10;

    public ItemOnOffer(Item item) {
        this.item=item;
    }

    public String getTitle() {
        return this.item.getTitle();
    }

    public Double getPrice() {
        return this.item.getPrice() - (this.item.getPrice() * DISCOUNT_POST_2000 /100);
    }

    public int getYear() {
        return this.item.getYear();
    }
}
