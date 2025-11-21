package com.principle2.OCPissue;

import java.util.List;

public class CSV extends Invoice{

    public CSV(ShopingCart2 shopingCart2) {
        super(shopingCart2);
    }

    @Override
    public void print() {
        List<Product2> products = shopingCart2.products;
        System.out.println("Print to CSV");
    }
}
