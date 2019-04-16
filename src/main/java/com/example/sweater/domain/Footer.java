package com.example.sweater.domain;

import javax.persistence.*;

@Entity
    @Table(name = "footer", schema = "public")
    public class Footer {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        @Column(name = "title_footer")
        private String title_footer;
        @Column(name = "body_footer")
        private String body_footer;
        @Column(name = "img")
        private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
        /*        @OnetoMany(targetEntity = Image1.class)
        @JoinColumn(name = "id_image")
        private String id_image;



    public String getId_image() {
        return id_image;
    }

    public void setId_image(String id_image) {
        this.id_image = id_image;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle_footer() {
        return title_footer;
    }

    public void setTitle_footer(String title_footer) {
        this.title_footer = title_footer;
    }

    public String getBody_footer() {
        return body_footer;
    }

    public void setBody_footer(String body_footer) {
        this.body_footer = body_footer;
    }
}