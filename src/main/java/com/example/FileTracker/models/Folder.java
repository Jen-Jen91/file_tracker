package com.example.FileTracker.models;

import javax.persistence.*;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
    }

    public Folder() {

    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
