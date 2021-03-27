package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PoliticalParty {




    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String doctrine;
    private int xPoint;
    private int yPoint;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctrine() {
        return doctrine;
    }

    public void setDoctrine(String doctrine) {
        this.doctrine = doctrine;
    }

    public int getxPoint() {
        return xPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }



}
