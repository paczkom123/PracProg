package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isEconomic() {
        return isEconomic;
    }

    public void setEconomic(boolean economic) {
        isEconomic = economic;
    }

    @Id
    @GeneratedValue
    private int id;
    private String question;
    private boolean isEconomic;

}