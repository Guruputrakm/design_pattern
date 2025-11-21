package com.principle.ISP;

public class MutiFunPrinter implements Printer, Scanable, Faxable {
    final static String name = "MultiFun";
    @Override
    public void fax() {
        System.out.println(name+" Faxing");
    }

    @Override
    public void print() {
        System.out.println(name+" is primnting");
    }

    @Override
    public void scan() {
        System.out.println(name+ "is scanning");
    }
}
