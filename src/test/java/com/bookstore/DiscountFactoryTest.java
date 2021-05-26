package com.bookstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DiscountFactoryTest {

    @Mock
    DiscountFactory mockDiscountFactory;

    @InjectMocks
    Item item=new Book();

    @Test
    void createDiscount30WhenTotalIsGreaterThan30() {
        //setup
        when(mockDiscountFactory.createDiscount(anyDouble())).thenCallRealMethod();
        //act
        Discount discount=mockDiscountFactory.createDiscount(40.0);
        //assert
        assertTrue(discount instanceof Discount30);
    }

    @Test
    void createDiscount0WhenTotalIsLesserThan30() {
        //setup
        when(mockDiscountFactory.createDiscount(anyDouble())).thenCallRealMethod();
        //act
        Discount discount=mockDiscountFactory.createDiscount(10.0);
        //assert
        assertTrue(discount instanceof Discount0);
    }

    @Test
    void createDiscount0WhenYearIsGreaterThan2000() {
        //setup
        item.setYear(2003);
        when(mockDiscountFactory.createDiscount(item)).thenCallRealMethod();
        //act
        Discount discount=mockDiscountFactory.createDiscount(item);
        //assert
        assertTrue(discount instanceof DiscountPublishedAfter2000);
    }


    @Test
    void createDiscount0WhenYearIsLessThan2000() {
        //setup
        item.setYear(1889);
        when(mockDiscountFactory.createDiscount(item)).thenCallRealMethod();
        //act
        Discount discount=mockDiscountFactory.createDiscount(item);
        //assert
        assertTrue(discount instanceof Discount0);
    }


}
