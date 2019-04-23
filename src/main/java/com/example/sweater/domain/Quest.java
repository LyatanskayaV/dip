package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "quest", schema = "public", catalog = "")
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_quest;

    @Column(name = "title_quest")
    private String title_quest;
    @Column(name = "body_quest")
    private String body_quest;
    @Column(name = "link_quest")
    private String link_quest;

    @ManyToOne
    @JoinColumn(name= "img_quest")
    private ImageC img_quest;

    public String getImg_quest() {
        return String.valueOf(img_quest.getPath());
    }

    public void setImg_quest(ImageC img_quest) {
        this.img_quest = img_quest;
    }


    public String getLink_quest() {
        return link_quest;
    }

    public void setLink_quest(String link_quest) {
        this.link_quest = link_quest;
    }

    public Long getId_quest() {
        return id_quest;
    }

    public void setId_quest(Long id_quest) {
        this.id_quest = id_quest;
    }

    public String getTitle_quest() {
        return title_quest;
    }

    public void setTitle_quest(String title_quest) {
        this.title_quest = title_quest;
    }

    public String getBody_quest() {
        return body_quest;
    }

    public void setBody_quest(String body_quest) {
        this.body_quest = body_quest;
    }
}
