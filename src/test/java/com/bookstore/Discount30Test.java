package com.bookstore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Discount30Test {

    @Test
    void test5PercentDiscountIfBookIsPublishedAfter2000() {
        //setup
        Discount30 order = new Discount30();
        //act and assert
        assertEquals(9.5, order.getDiscountedValue(10.0));
    }
}
