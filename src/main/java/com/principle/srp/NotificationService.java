package com.principle.srp;

public class NotificationService {
    private BookManager bookManager;

    public NotificationService(BookManager bookManager) {
        this.bookManager = bookManager;
    }

    public void sendemail(){
        bookManager.getBooks();
    }
}
