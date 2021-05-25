package com.bookstore;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class Checkout {
    private static Checkout checkout;
    private List<Item> items;
    private DiscountFactory discountFactory;

    private Checkout() {
    }

    public static Checkout getInstance() {
        if (checkout == null) {
            checkout = new Checkout();
        }
        return checkout;
    }

    void addItems(List<Item> items) {
        this.items = items;
    }

    Double calculatePaymentAmountAfterDiscount() {
        Double total = 0.0;
        for (Item item : items) {
            total = total + DiscountFactory.getInstance().getDiscountedItemPrice(item);
        }
        Double totalAfterCheckoutDiscount = getCheckoutDiscount(total);
        return getFormattedTotal(totalAfterCheckoutDiscount);
    }

    private Double getCheckoutDiscount(Double total) {
        discountFactory = DiscountFactory.getInstance();
        Double totalAfterCheckoutDiscount = discountFactory.getTotal(total);
        return totalAfterCheckoutDiscount;
    }

    private Double getFormattedTotal(Double total) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        df2.setRoundingMode(RoundingMode.FLOOR);
        return Double.parseDouble(df2.format(total));
    }
}
