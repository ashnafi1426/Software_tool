package com.blogsystem;

public class Admin extends User {

    public Admin() {
        this.role = "ADMIN";
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }

    public void approvePost() {
        System.out.println("Post approved.");
    }

    public void removePost() {
        System.out.println("Post removed.");
    }

    public void manageCategories() {
        System.out.println("Managing categories...");
    }
}
