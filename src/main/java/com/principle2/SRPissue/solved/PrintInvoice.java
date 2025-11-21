package com.principle2.SRPissue.solved;

import java.util.List;

public class PrintInvoice {
    ShoppingCart1 shoppingCart1;

    public PrintInvoice(ShoppingCart1 shoppingCart1) {
        this.shoppingCart1 = shoppingCart1;
    }

    public void printInvoice(){
        List<Product1> products = shoppingCart1.products;
        double v = shoppingCart1.calPrice();
        /*
        * Logic to get each products and its price and print with calualted price
        * */
    }
}
