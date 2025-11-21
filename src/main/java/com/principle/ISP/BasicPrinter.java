package com.principle.ISP;

public class BasicPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("Normal Printer Printing it");
    }
}
