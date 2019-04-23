package com.example.sweater.domain;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table(name = "news", schema = "public", catalog = "")
public class News {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id_news;

    @Column(name = "title_news")
    private String title_news;
    @Column(name = "body_news")
    private String body_news;
    @Column(name = "date_news")
    private String date_news;

    @ManyToOne
    @JoinColumn(name= "img_news")
    private ImageC img_news;

    public String getImg_news() {
        return String.valueOf(img_news.getPath());
    }

    public void setImg_news(ImageC img_news) {
        this.img_news = img_news;
    }


    public Long getId_news() {
        return id_news;
    }

    public void setId_news(Long id_news) {
        this.id_news = id_news;
    }

    public String getTitle_news() {
        return title_news;
    }

    public void setTitle_news(String title_news) {
        this.title_news = title_news;
    }

    public String getBody_news() {
        return body_news;
    }

    public void setBody_news(String body_news) {
        this.body_news = body_news;
    }

    public String getDate_news() {
        return date_news;
    }

    public void setDate_news(String date_news) {
        this.date_news = date_news;
    }
}
