package com.bookstore;

public class OrderDiscountFactory {
    public Double getTotal(Double total) {
        if(total > 30){
            total=new CheckoutDiscount30().getTotal(total);
        }
        return total;
    }
}
