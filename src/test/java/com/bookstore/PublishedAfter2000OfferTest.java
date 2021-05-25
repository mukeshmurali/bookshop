//package com.bookstore;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//@ExtendWith(MockitoExtension.class)
//public class PublishedAfter2000OfferTest {
//
//    @Mock
//    Item item;
//
//    @InjectMocks
//    PublishedAfter2000Offer bookOnOffer=new PublishedAfter2000Offer(item);
//
//    @Test
//    void test10PercentDiscountIfBookIsPublishedAfter2000() {
//        //setup
//        Mockito.when(item.getPrice()).thenReturn(10.0);
//        //act and assert
//        assertEquals(9,bookOnOffer.getPrice());
//    }
//}
