package com.example.sweater.domain;


import javax.persistence.*;

@Entity
@Table(name = "imageС", schema = "public", catalog = "")
public class ImageC {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_image;

    @Column(name = "path")
    private String path;

    public Integer getId_image() {
        return id_image;
    }

    public void setId_image(Integer id_image) {
        this.id_image = id_image;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
