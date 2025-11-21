package com.principle2.lsp2;

public class SavingAccount implements WIthDrawableAccount{
    @Override
    public double withDraw() {
        System.out.println("With Drawing");
        return 10;
    }

    @Override
    public void deposite() {
        System.out.println("Depositing Amount");
    }
}
