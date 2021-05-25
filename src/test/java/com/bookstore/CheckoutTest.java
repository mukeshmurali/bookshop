package com.bookstore;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {
    Checkout checkout;

    @Test
    void checkoutTwoBooksWithOneBookPublishedAfter2000() {
        //setup
        List<Item> bookList = new ArrayList<>();
        Item book1 = getItem(12.87, "Three Men in a Boat", 1889);
        Item book2 = getItem(13.14, "The Terrible Privacy of Maxwell Sim", 2010);
        bookList.add(book1);
        bookList.add(book2);
        checkout = new Checkout(bookList);
        //act
        Double cost=checkout.calculatePaymentAmountAfterDiscount();
        //assert
        assertEquals(24.69,cost);
    }

    @NotNull
    private Item getItem(double price, String title, int year) {
        Item book = new Book();
        book.setPrice(price);
        book.setTitle(title);
        book.setYear(year);
        return book;
    }
}
