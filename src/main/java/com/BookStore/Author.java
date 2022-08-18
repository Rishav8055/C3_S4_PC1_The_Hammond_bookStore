package com.BookStore;

public class Author extends Book {
    private String authorName;
    private String authorPen;

    public Author(String title, String isbnNumber, String description, int price, String authorName, String authorPen) {
        super(title, isbnNumber, description, price);
        this.authorName = authorName;
        this.authorPen = authorPen;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPen() {
        return authorPen;
    }

    public void setAuthorPen(String authorPen) {
        this.authorPen = authorPen;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorPen='" + authorPen + '\'' +
                '}';
    }
}
