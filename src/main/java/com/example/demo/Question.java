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



    @Id
    @GeneratedValue
    private int id;
    private String question;
    private char axle;

    public char getAxle() {
        return axle;
    }

    public void setAxle(char axle) {
        this.axle = axle;
    }

    public boolean isHasPositiveImpact() {
        return hasPositiveImpact;
    }

    public void setHasPositiveImpact(boolean hasPositiveImpact) {
        this.hasPositiveImpact = hasPositiveImpact;
    }

    private boolean hasPositiveImpact;

}