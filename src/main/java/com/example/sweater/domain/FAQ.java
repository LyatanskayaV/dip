package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "faq", schema = "public")
public class FAQ {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_faq;
    @Column(name = "answer_faq")
    private String answer_faq;
    @Column(name = "question_faq")
    private String question_faq;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name="author_faq")
    private User author_faq;


    public FAQ(){
    }


    public FAQ(String answer_faq, String question_faq, User author_faq) {
        this.answer_faq = answer_faq;
        this.question_faq = question_faq;
        this.author_faq = author_faq;
    }

    public Long getId_faq() {
        return id_faq;
    }

    public void setId_faq(Long id_faq) {
        this.id_faq = id_faq;
    }

    public String getAnswer_faq() {
        return answer_faq;
    }

    public void setAnswer_faq(String answer_faq) {
        this.answer_faq = answer_faq;
    }

    public String getQuestion_faq() {
        return question_faq;
    }

    public void setQuestion_faq(String question_faq) {
        this.question_faq = question_faq;
    }

    public String getAuthor_faq() {
        return author_faq.getUsername();
    }

    public void setAuthor_faq(User author_faq) {
        this.author_faq =  author_faq;
    }
}