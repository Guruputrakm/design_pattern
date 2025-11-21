package com.principle2.lsp2;

public class FDAccount implements Account{
    @Override
    public void deposite() {
        System.out.println("Depositing account to FD");
    }
}
