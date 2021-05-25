package com.bookstore;

public class OrderDiscountFactory {
    private static OrderDiscountFactory orderDiscountFactory;
    public Double getTotal(Double total) {
        if(total > 30){
            total=new CheckoutDiscount30().getTotal(total);
        }
        return total;
    }

    public static OrderDiscountFactory getInstance(){
        if(orderDiscountFactory == null){
            orderDiscountFactory = new OrderDiscountFactory();
        }
        return orderDiscountFactory;
    }

    private OrderDiscountFactory() {
    }
}
