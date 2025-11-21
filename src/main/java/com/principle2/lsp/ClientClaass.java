package com.principle2.lsp;

public class ClientClaass {
    public static void main(String[] args) {
        A a = new A();
        a.m2();a.m1();a.m3();
        a = new B();
        a.m2();a.m1();a.m3();
    }
}
