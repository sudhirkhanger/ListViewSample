package com.sudhirkhanger.app.listviewsample;

/*
 * This is a model class
 * Each book item contains
 * a title and an author
 * Getters, Setters, Constructor, and
 * toString is generated using shortcut
 * Alt+Inset.
 */
public class Books {
    String title;
    String author;

    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
