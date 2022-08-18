package com.BookStore;

public class BookIMPL {
    public static void main(String[] args) {

       Author author = new Author("The Beast","ISBN123","Comics",500,"ABCD","link");
       author.setTitle("The Beast");
       author.setIsbnNumber("BSI123");
       author.setDescription("Comics");
       author.setPrice(500);
       author.setAuthorName("rishav");
       author.setAuthorPen("cello");
       author.showBookDetail();

    }
}