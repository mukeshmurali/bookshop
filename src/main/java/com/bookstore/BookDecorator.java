package com.bookstore;;

public abstract class BookDecorator extends Item{
    Item item;
    public abstract String getTitle();
    public abstract Double getPrice();
    public abstract int getYear();
}
