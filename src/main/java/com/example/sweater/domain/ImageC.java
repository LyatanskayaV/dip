package com.example.sweater.domain;


import javax.persistence.*;

@Entity
@Table(name = "imageС", schema = "public")
public class ImageC {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_image;

    @Column(name = "path")
    private String path;

    public ImageC(){
    }

    public ImageC(String path) {
        this.path = path;
    }

    public int getId_image() {
        return id_image;
    }

    public void setId_image(int id_image) {
        this.id_image = id_image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
