package com.bookstore;

public class BookOnOffer extends BookDecorator {

    public static final int DISCOUNT_POST_2000 = 10;

    public BookOnOffer(Item item) {
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
