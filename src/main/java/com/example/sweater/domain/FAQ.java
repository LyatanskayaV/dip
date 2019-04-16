package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "faq", schema = "public")
public class FAQ {
    @Id
    @Column(name = "id_faq")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_faq;



    @Column(name = "answer_faq")
    private String answer_faq;
    @Column(name = "question_faq")
    private String question_faq;

    public Integer getId_faq() {
        return id_faq;
    }

    public void setId_faq(Integer id_faq) {
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
}