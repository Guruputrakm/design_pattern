package com.principle2.OCPissue;

import com.principle2.SRPissue.solved.Product1;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart2 {

    List<Product2> products;

    public ShopingCart2() {
        products = new ArrayList<>();
    }

    public void addProduct(Product2 product) {
        products.add(product);
    }

    public void removeProduct(Product2 product){
        products.remove(product);
    }

    public double calPrice(){
        //cal price;
        return 0.0;
    }
}
