package com.principle2.SRPissue.solved;

import java.util.List;

public class StoreToDB {
    ShoppingCart1 shoppingCart1;

    public StoreToDB(ShoppingCart1 shoppingCart1) {
        this.shoppingCart1 = shoppingCart1;
    }

    public void store(){
        List<Product1> products = shoppingCart1.products;
        //Call DB steps to store
    }
}
