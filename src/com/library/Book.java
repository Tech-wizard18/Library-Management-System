package com.library;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int bookId, String author, String title){
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.isIssued = false;

    }
    public int getBookId(){
        return bookId;
    }

    public boolean isIssued(){
        return isIssued;
    }
    public void issueBook(){
        isIssued = true;
    }
    public void returnBook(){
        isIssued = false;
    }

    public void displayBook() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Author: " + author + " | Issued: " + (isIssued ? "Yes" : "No"));
    }


}
