package com.figura.speedway.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "speedway_rider")
@Entity(name = "speedway_rider")
public class Speedway_rider {

    @Id
    @Column(name = "id")
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "country_of_birth")
    private String countryOfBirth;
    @Column(name = "place_of_birth")
    private String placeOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Date getRipDate() {
        return ripDate;
    }

    public void setRipDate(Date ripDate) {
        this.ripDate = ripDate;
    }

    public String getPlaceOfRip() {
        return placeOfRip;
    }

    public void setPlaceOfRip(String placeOfRip) {
        this.placeOfRip = placeOfRip;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public int getHeats() {
        return heats;
    }

    public void setHeats(int heats) {
        this.heats = heats;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getBonuses() {
        return bonuses;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    public int getFullPerfects() {
        return fullPerfects;
    }

    public void setFullPerfects(int fullPerfects) {
        this.fullPerfects = fullPerfects;
    }

    public int getPaidPerfects() {
        return paidPerfects;
    }

    public void setPaidPerfects(int paidPerfects) {
        this.paidPerfects = paidPerfects;
    }

    public Speedway_rider (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "rip_date")
    private Date ripDate;
    @Column(name = "place_of_rip")
    private String placeOfRip;
    @Column(name = "points")
    private double points;
    @Column(name = "heats")
    private int heats;
    @Column(name = "games")
    private int games;
    @Column(name = "bonuses")
    private int bonuses;
    @Column(name = "full_perfects")
    private int fullPerfects;
    @Column(name = "paid_perfects")
    private int paidPerfects;




}
