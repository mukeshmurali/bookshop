package com.bookstore;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Checkout {
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
        if(total > 30)
            total= total - (total *5/100);
        DecimalFormat df2= new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(df2.format(total));
    }
}
