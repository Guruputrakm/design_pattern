package com.principle2.SRPissue.solved;

public class Main {
    public static void main(String[] args) {

        ShoppingCart1 shoppingCart1 = new ShoppingCart1();

        shoppingCart1.addProduct(new Product1("Laptop",1,25.00));

        PrintInvoice printInvoice = new PrintInvoice(shoppingCart1);
        printInvoice.printInvoice();

        StoreToDB storeToDB = new StoreToDB(shoppingCart1);
        storeToDB.store();

    }
}
