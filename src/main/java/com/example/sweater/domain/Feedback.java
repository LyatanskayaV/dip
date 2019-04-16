package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "feedback", schema = "public")
public class Feedback {
    @Id
    @Column(name = "id_feedback")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_feedback;

    /*@ElementCollection(targetClass = User.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "usr", joinColumns = @JoinColumn(name = "id"))
    private Collection<User> author_feedback;*/

    @ManyToOne
    @JoinColumn(name= "author_feedback")
    private User author_feedback;



    @Column(name = "title_feedback")
    private String title_feedback;
    @Column(name = "body_feedback")
    private String body_feedback;
    @Column(name = "date_feedback")
    private String date_feedback;

    public Integer getId_feedback() {
        return id_feedback;
    }

    public String getAuthor_feedback() {
        return String.valueOf(author_feedback.getUsername());
    }

    public void setAuthor_feedback(User author_feedback) {
        this.author_feedback = author_feedback;
    }

    public void setId_feedback(Integer id_feedback) {
        this.id_feedback = id_feedback;
    }



    public String getTitle_feedback() {
        return title_feedback;
    }

    public void setTitle_feedback(String title_feedback) {
        this.title_feedback = title_feedback;
    }

    public String getBody_feedback() {
        return body_feedback;
    }

    public void setBody_feedback(String body_feedback) {
        this.body_feedback = body_feedback;
    }

    public String getDate_feedback() {
        return date_feedback;
    }

    public void setDate_feedback(String date_feedback) {
        this.date_feedback = date_feedback;
    }
}