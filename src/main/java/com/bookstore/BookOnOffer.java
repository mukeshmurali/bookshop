package com.bookstore;

public class BookOnOffer extends BookDecorator {

    public BookOnOffer(Item item) {
        this.item=item;
    }

    public String getTitle() {
        return this.item.getTitle();
    }

    public Double getPrice() {
        return this.item.getPrice() - (this.item.getPrice() *10/100);
    }

    public int getYear() {
        return this.item.getYear();
    }
}
