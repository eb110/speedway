package com.figura.speedway.dto;

import java.util.ArrayList;
import java.util.List;

public class DtoSpeedwayMatch {

    public DtoSpeedwayMatch() {
    }

    private int awayId;
    private int homeId;
    private String dateOfGame;
    private int league;
    private String round;
    private List<DtoRider> awayRiders = new ArrayList<>();
    private List<DtoRider> homeRiders = new ArrayList<>();

    public int getAwayId() {
        return awayId;
    }

    public void setAwayId(int awayId) {
        this.awayId = awayId;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public String getDateOfGame() {
        return dateOfGame;
    }

    public void setDateOfGame(String dateOfGame) {
        this.dateOfGame = dateOfGame;
    }

    public int getLeague() {
        return league;
    }

    public void setLeague(int league) {
        this.league = league;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public List<DtoRider> getAwayRiders() {
        return awayRiders;
    }

    public void setAwayRiders(List<DtoRider> awayRiders) {
        this.awayRiders = awayRiders;
    }

    public List<DtoRider> getHomeRiders() {
        return homeRiders;
    }

    public void setHomeRiders(List<DtoRider> homeRiders) {
        this.homeRiders = homeRiders;
    }
}




