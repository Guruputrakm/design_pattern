package com.principle.ISP;

public class PrinterApp {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print();

        Printer p1 = new MutiFunPrinter();
        p1.print();
        MutiFunPrinter p2 = (MutiFunPrinter) p1;
        p2.fax();
        p2.scan();

        AdvancePrinter advancePrinter = new AdvancePrinter();
        advancePrinter.fax();
        advancePrinter.scan();
        advancePrinter.print();
        advancePrinter.readEmail();
    }
}
