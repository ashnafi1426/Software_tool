package com.blogsystem;

public class Category {

    private int categoryId;
    private String name;

    public Category() {}

    public Category(int categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public void addCategory() {
        System.out.println("Category added.");
    }

    public void removeCategory() {
        System.out.println("Category removed.");
    }

    // Getters & Setters
    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
