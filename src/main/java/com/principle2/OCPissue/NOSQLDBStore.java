package com.principle2.OCPissue;

public class NOSQLDBStore implements Persiatnce{

    ShopingCart2 shopingCart2;

    public NOSQLDBStore(ShopingCart2 shopingCart2) {
        this.shopingCart2 = shopingCart2;
    }

    @Override
    public void store() {
        // Store it to Mongo DB
        System.out.println("Storeed");
        shopingCart2.products.stream().forEach( p -> System.out.println(p.getName()+" -- "+p.getPrice()
        ));
    }
}
