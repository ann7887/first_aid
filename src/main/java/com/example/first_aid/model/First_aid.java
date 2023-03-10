package com.example.first_aid.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class First_aid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String complect;

    public First_aid(String complect) {
        this.complect = complect;
    }

    public String getComplect() {
        return complect;
    }

    public void setComplect(String complect) {
        this.complect = complect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}
