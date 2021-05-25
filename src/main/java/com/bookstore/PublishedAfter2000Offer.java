package com.bookstore;

public class PublishedAfter2000Offer extends ItemDecorator {

    public static final int DISCOUNT_POST_2000 = 10;

    public PublishedAfter2000Offer(Item item) {
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
