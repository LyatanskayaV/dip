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


    @ManyToOne
    @JoinColumn(name= "img_footer")
    private ImageC img_footer;

    public String getImg_footer() {
        return String.valueOf(img_footer.getPath());
    }

    public void setImg_footer(ImageC img_footer) {
        this.img_footer = img_footer;
    }

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