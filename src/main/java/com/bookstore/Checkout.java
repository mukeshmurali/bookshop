package com.bookstore;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Checkout {
    public static final int CHECKOUT_TOTAL_ELIGIBLE_FOR_DISCOUNT = 30;
    public static final int TOTALAMOUNT_DISCOUNT_PERCENTAGE = 5;
    private static Checkout checkout;
    List<Item> items;

    public static Checkout getInstance(){
        if(checkout == null){
            checkout = new Checkout();
        }
        return checkout;
    }
    private Checkout() {}

    public void addItems(List<Item> items){
        this.items=items;
    }

    public Double calculatePaymentAmountAfterDiscount() {
        Double total=0.0;
        for (Item item: items) {
            if(item.getYear() > 2000){
                Item item_= new BookOnOffer(item);
                total = total + item_.getPrice();
            } else {
                total = total + item.getPrice();
            }
        }
        if(total > CHECKOUT_TOTAL_ELIGIBLE_FOR_DISCOUNT)
            total= total - (total * TOTALAMOUNT_DISCOUNT_PERCENTAGE /100);
        return getFormattedTotal(total);
    }

    private Double getFormattedTotal(Double total) {
        DecimalFormat df2= new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(df2.format(total));
    }
}
