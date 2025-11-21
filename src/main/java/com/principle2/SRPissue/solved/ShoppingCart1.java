package com.principle2.SRPissue.solved;

import com.principle2.SRPissue.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart1 {
    List<Product1> products;

    public ShoppingCart1() {
        products = new ArrayList<>();
    }

    public void addProduct(Product1 product) {
        products.add(product);
    }

    public void removeProduct(Product1 product){
        products.remove(product);
    }

    public double calPrice(){
        //cal price;
        return 0.0;
    }
}
