package com.principle.ISP;

public class AdvancePrinter extends MutiFunPrinter implements AdvanceConnection{
    static final String name = "advamnce";

    @Override
    public void scan() {
        super.scan();
        System.out.println("Next level Scanning");
    }

    @Override
    public void fax() {
        System.out.println("No Fax is supporting, it is stopped");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Advance Prinrting");
    }

    @Override
    public void readEmail() {

    }
}
