package com.bookstore;;

public abstract class ItemDecorator extends Item{
    Item item;
    public abstract String getTitle();
    public abstract Double getPrice();
    public abstract int getYear();
}
