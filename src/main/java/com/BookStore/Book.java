package com.BookStore;

public class Book {
    private String title;
    private String isbnNumber;
    private String description;
    private int    price;

    public Book(String title, String isbnNumber, String description, int price) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void displayBookDetail(){
        System.out.println("Book Detail");
        System.out.println("title = " +title);
        System.out.println("isbnNumber = " +isbnNumber);
        System.out.println("description = " +description);
        System.out.println("price = ₹"+ price);


    }
}
