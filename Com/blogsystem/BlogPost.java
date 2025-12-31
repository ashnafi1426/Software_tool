package com.blogsystem;

import java.util.Date;

public class BlogPost {

    private int postId;
    private String title;
    private String content;
    private Date publishDate;
    private String status;
    private Category category;
    private User author;

    public BlogPost() {}

    public BlogPost(int postId, String title, String content, User author) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.status = "DRAFT";
    }

    public void createPost() {
        System.out.println("Blog post created.");
    }

    public void editPost() {
        System.out.println("Blog post edited.");
    }

    public void deletePost() {
        System.out.println("Blog post deleted.");
    }

    public void publishPost() {
        this.status = "PUBLISHED";
        this.publishDate = new Date();
        System.out.println("Blog post published.");
    }

    // Getters & Setters
    public int getPostId() { return postId; }
    public void setPostId(int postId) { this.postId = postId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getPublishDate() { return publishDate; }
    public String getStatus() { return status; }

    public User getAuthor() { return author; }
}
