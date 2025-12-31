package com.blogsystem;

import java.util.Date;

public class Comment {

    private int commentId;
    private String content;
    private Date commentDate;
    private User author;
    private BlogPost blogPost;

    public Comment() {}

    public Comment(int commentId, String content, User author, BlogPost blogPost) {
        this.commentId = commentId;
        this.content = content;
        this.author = author;
        this.blogPost = blogPost;
        this.commentDate = new Date();
    }

    public void addComment() {
        System.out.println("Comment added.");
    }

    public void deleteComment() {
        System.out.println("Comment deleted.");
    }

    // Getters & Setters
    public int getCommentId() { return commentId; }
    public void setCommentId(int commentId) { this.commentId = commentId; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getCommentDate() { return commentDate; }
}
