package com.daniel;

import java.util.ArrayList;

public class Library {
    ArrayList<Boook> bookList;

    Library() {
        this.bookList = new ArrayList<Boook>();
    }
    public void printBookDetails(Boook book) {
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Book isbn: " + book.getIsbn());
    }

    public void addBook(Boook book) {
        bookList.add(book);
    }

    public void removeBook(Boook book) {
        bookList.remove(book);
    }
}
