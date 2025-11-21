package com.principle.srp;

public class ReportGenerator {

    private BookManager bookManager;

    public ReportGenerator(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public void generate() {
        //send email logic for
        System.out.println(bookManager.getBooks());
    }
}
