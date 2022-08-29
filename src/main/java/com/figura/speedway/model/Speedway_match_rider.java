package com.figura.speedway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "speedway_match_rider")
@Entity(name = "speedway_match_rider")
public class Speedway_match_rider {

    public Speedway_match_rider() {
    }

    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "id_rider")
    private int idRider;
    @Column(name = "id_team")
    private int idTeam;
    @Column(name = "id_match")
    private int idMatch;
    @Column(name = "rider_match_number")
    private int riderMatchNumber;
    @Column(name = "home_away_side")
    private String homeAwaySide;
    @Column(name = "pkt")
    private String pkt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdRider() {
        return idRider;
    }

    public void setIdRider(int idRider) {
        this.idRider = idRider;
    }

    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdMatch() {
        return idMatch;
    }

    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }

    public int getRiderMatchNumber() {
        return riderMatchNumber;
    }

    public void setRiderMatchNumber(int riderMatchNumber) {
        this.riderMatchNumber = riderMatchNumber;
    }

    public String getHomeAwaySide() {
        return homeAwaySide;
    }

    public void setHomeAwaySide(String homeAwaySide) {
        this.homeAwaySide = homeAwaySide;
    }

    public String getPkt() {
        return pkt;
    }

    public void setPkt1(String pkt) {
        this.pkt = pkt;
    }

}
