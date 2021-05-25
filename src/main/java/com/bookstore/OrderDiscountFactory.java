package com.bookstore;

public class OrderDiscountFactory {
    public static final int DISCOUNT_PUBLISHEDYEAR = 2000;
    private static OrderDiscountFactory orderDiscountFactory;
    public Double getTotal(Double total) {
        if(total > 30){
            total=new CheckoutDiscount30().getDiscountedValue(total);
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

    public Double getDiscountedItemPrice(Item item) {
        Double total=item.getPrice();
        if(item.getYear() > DISCOUNT_PUBLISHEDYEAR){
            total = new PublishedAfter2000Offer().getDiscountedValue(item.getPrice());
        }
        return total;
    }
}
