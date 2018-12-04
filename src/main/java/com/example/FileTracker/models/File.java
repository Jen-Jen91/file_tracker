package com.example.FileTracker.models;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "extension")
    private String extension;

    @Column(name = "size")
    private double size;

    @ManyToOne
    @JoinColumn(name = "folder_id", nullable = false)
    private Folder folder;

    public File(String name, String extension, double size, Folder folder) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.folder = folder;
    }

    public File() {

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getExtension() {
        return this.extension;
    }

    public double getSize() {
        return this.size;
    }

    public Folder getFolder() {
        return this.folder;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

}
