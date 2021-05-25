package com.bookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountPublishedAfter2000Test {

    @Test
    void test10PercentDiscountIfBookIsPublishedAfter2000() {
        //setup
        DiscountPublishedAfter2000 bookOnOffer = new DiscountPublishedAfter2000();
        //act and assert
        assertEquals(9, bookOnOffer.getDiscountedValue(10.0));
    }
}
