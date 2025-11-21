package com.principle2.lsp2;

public class ClientClassExample {
    public static void main(String[] args) {
        WIthDrawableAccount account = new SavingAccount();
        account.deposite();
        account.withDraw();

        Account account1 = new FDAccount();
        account1.deposite();

    }

}
