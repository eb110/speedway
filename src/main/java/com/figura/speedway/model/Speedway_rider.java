package com.figura.speedway.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Speedway_rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;
    private Date birthDate;
    private String countryOfBirth;
    private String placeOfBirth;

    public Speedway_rider (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Date ripDate;
    private String placeOfRip;
    private double points;
    private int heats;
    private int games;
    private int bonuses;
    private int fullPerfects;
    private int paidPerfects;




}
