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
    @Column(name = "pkt1")
    private String pkt1;
    @Column(name = "pkt2")
    private String pkt2;
    @Column(name = "pkt3")
    private String pkt3;
    @Column(name = "pkt4")
    private String pkt4;
    @Column(name = "pkt5")
    private String pkt5;
    @Column(name = "pkt6")
    private String pkt6;
    @Column(name = "pkt7")
    private String pkt7;
    @Column(name = "pkt8")
    private String pkt8;

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

    public String getPkt1() {
        return pkt1;
    }

    public void setPkt1(String pkt1) {
        this.pkt1 = pkt1;
    }

    public String getPkt2() {
        return pkt2;
    }

    public void setPkt2(String pkt2) {
        this.pkt2 = pkt2;
    }

    public String getPkt3() {
        return pkt3;
    }

    public void setPkt3(String pkt3) {
        this.pkt3 = pkt3;
    }

    public String getPkt4() {
        return pkt4;
    }

    public void setPkt4(String pkt4) {
        this.pkt4 = pkt4;
    }

    public String getPkt5() {
        return pkt5;
    }

    public void setPkt5(String pkt5) {
        this.pkt5 = pkt5;
    }

    public String getPkt6() {
        return pkt6;
    }

    public void setPkt6(String pkt6) {
        this.pkt6 = pkt6;
    }

    public String getPkt7() {
        return pkt7;
    }

    public void setPkt7(String pkt7) {
        this.pkt7 = pkt7;
    }

    public String getPkt8() {
        return pkt8;
    }

    public void setPkt8(String pkt8) {
        this.pkt8 = pkt8;
    }
}
