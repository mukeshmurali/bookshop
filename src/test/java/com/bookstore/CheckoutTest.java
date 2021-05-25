package com.bookstore;

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
        Item book1 = new Book();
        book1.setPrice(12.87);
        book1.setTitle("Three Men in a Boat");
        book1.setYear(1889);
        Item book2 = new Book();
        book2.setPrice(13.14);
        book2.setTitle("The Terrible Privacy of Maxwell Sim");
        book2.setYear(2010);
        bookList.add(book1);
        bookList.add(book2);
        checkout = new Checkout(bookList);
        //act
        Double cost=checkout.calculatePaymentAmountAfterDiscount();
        //assert
        assertEquals(24.69,cost);
    }
}
