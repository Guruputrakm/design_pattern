package com.principle2.OCPissue;

public abstract class Invoice {

    ShopingCart2 shopingCart2;

    public Invoice(ShopingCart2 shopingCart2) {
        this.shopingCart2 = shopingCart2;
    }

    public abstract void print();
}
