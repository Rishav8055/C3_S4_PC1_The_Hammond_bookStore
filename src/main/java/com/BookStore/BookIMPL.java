package com.BookStore;

public class BookIMPL {
    public static void main(String[] args) {
       Book book = new Book("The Beast","BSI123","Comics",500);
       book.setTitle("The Beast");
       book.setIsbnNumber("BSI123");
       book.setDescription("Comics");
       book.setPrice(500);
       book.displayBookDetail();

    }
}