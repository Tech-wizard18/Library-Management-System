package com.library;

public class User {
    private int userID;
    private String name;

    public User(int userId, String name){
        this.userID = userId;
        this.name = name;

    }
    public void displayUser(){
        System.out.println("User ID: " + userID + ",Name: " + name);
    }

}
