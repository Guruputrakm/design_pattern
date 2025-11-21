package com.principle2.lsp2;

public class CurrentAccount implements WIthDrawableAccount{
    @Override
    public double withDraw() {
        System.out.println("Taking Current acoount money");
        return 10;
    }

    @Override
    public void deposite() {
        System.out.println("Depositing To cvurrent acciount");
    }
}
