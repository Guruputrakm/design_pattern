package com.principle2.OCPissue;

public class MainExample {
    public static void main(String[] args) {
        ShopingCart2 shopingCart2 = new ShopingCart2();

        shopingCart2.addProduct(new Product2("Laptop",1,2500));

        Persiatnce persiatnce = new NOSQLDBStore(shopingCart2);
        persiatnce.store();

    }
}
