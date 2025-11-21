package com.principle2.SRPissue;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double calPrice(){
        //cal price;
        return 0.0;
    }

    // SPR voilation
    public void PrintInvoice(){}

    public void storeDB(){}

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("Lapton",1,25.00));

        double v = shoppingCart.calPrice();
        shoppingCart.PrintInvoice();
        shoppingCart.storeDB();
    }
}
