package com.principle2.OCPissue;

public class DBStore implements Persiatnce{
    ShopingCart2 shopingCart2;

    public DBStore(ShopingCart2 shopingCart2) {
        this.shopingCart2 = shopingCart2;
    }

    public void store() {
        //Store To MYSQL DB
    }
}
