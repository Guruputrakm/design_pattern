package com.principle.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookManager {

    private List<Book> books;

    public BookManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
    public void deleteBook(int id) {
        Optional<Book> first = books.stream().filter(b -> b.getBookId() == id).findFirst();
        if (first.isPresent()) {
            books.remove(first.get());
        }

    }
}
