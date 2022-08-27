package com.figura.speedway.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "speedway_match")
@Entity(name = "speedway_match")
public class Speedway_match {

    public Speedway_match() {
    }

    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "date_of_match")
    private Date dateOfMatch;
    @Column(name = "round")
    private String round;
    @Column(name = "id_team_away")
    private int idTeamAway;
    @Column(name = "id_team_home")
    private int idTeamHome;
    @Column(name = "points_away_team")
    private double pointsAwayTeam;
    @Column(name = "points_home_team")
    private double pointsHomeTeam;
    @Column(name = "type_of_game")
    private String typeOfGame;
    @Column(name = "id_player1")
    private int idPlayer1;
    @Column(name = "id_player2")
    private int idPlayer2;
    @Column(name = "id_player3")
    private int idPlayer3;
    @Column(name = "id_player4")
    private int idPlayer4;
    @Column(name = "id_player5")
    private int idPlayer5;
    @Column(name = "id_player6")
    private int idPlayer6;
    @Column(name = "id_player7")
    private int idPlayer7;
    @Column(name = "id_player8")
    private int idPlayer8;
    @Column(name = "id_player9")
    private int idPlayer9;
    @Column(name = "id_player10")
    private int idPlayer10;
    @Column(name = "id_player11")
    private int idPlayer11;
    @Column(name = "id_player12")
    private int idPlayer12;
    @Column(name = "id_player13")
    private int idPlayer13;
    @Column(name = "id_player14")
    private int idPlayer14;
    @Column(name = "id_player15")
    private int idPlayer15;
    @Column(name = "id_player16")
    private int idPlayer16;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfMatch() {
        return dateOfMatch;
    }

    public void setDateOfMatch(Date dateOfMatch) {
        this.dateOfMatch = dateOfMatch;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public int getIdTeamAway() {
        return idTeamAway;
    }

    public void setIdTeamAway(int idTeamAway) {
        this.idTeamAway = idTeamAway;
    }

    public int getIdTeamHome() {
        return idTeamHome;
    }

    public void setIdTeamHome(int idTeamHome) {
        this.idTeamHome = idTeamHome;
    }

    public double getPointsAwayTeam() {
        return pointsAwayTeam;
    }

    public void setPointsAwayTeam(double pointsAwayTeam) {
        this.pointsAwayTeam = pointsAwayTeam;
    }

    public double getPointsHomeTeam() {
        return pointsHomeTeam;
    }

    public void setPointsHomeTeam(double pointsHomeTeam) {
        this.pointsHomeTeam = pointsHomeTeam;
    }

    public String getTypeOfGame() {
        return typeOfGame;
    }

    public void setTypeOfGame(String typeOfGame) {
        this.typeOfGame = typeOfGame;
    }

    public int getIdPlayer1() {
        return idPlayer1;
    }

    public void setIdPlayer1(int idPlayer1) {
        this.idPlayer1 = idPlayer1;
    }

    public int getIdPlayer2() {
        return idPlayer2;
    }

    public void setIdPlayer2(int idPlayer2) {
        this.idPlayer2 = idPlayer2;
    }

    public int getIdPlayer3() {
        return idPlayer3;
    }

    public void setIdPlayer3(int idPlayer3) {
        this.idPlayer3 = idPlayer3;
    }

    public int getIdPlayer4() {
        return idPlayer4;
    }

    public void setIdPlayer4(int idPlayer4) {
        this.idPlayer4 = idPlayer4;
    }

    public int getIdPlayer5() {
        return idPlayer5;
    }

    public void setIdPlayer5(int idPlayer5) {
        this.idPlayer5 = idPlayer5;
    }

    public int getIdPlayer6() {
        return idPlayer6;
    }

    public void setIdPlayer6(int idPlayer6) {
        this.idPlayer6 = idPlayer6;
    }

    public int getIdPlayer7() {
        return idPlayer7;
    }

    public void setIdPlayer7(int idPlayer7) {
        this.idPlayer7 = idPlayer7;
    }

    public int getIdPlayer8() {
        return idPlayer8;
    }

    public void setIdPlayer8(int idPlayer8) {
        this.idPlayer8 = idPlayer8;
    }

    public int getIdPlayer9() {
        return idPlayer9;
    }

    public void setIdPlayer9(int idPlayer9) {
        this.idPlayer9 = idPlayer9;
    }

    public int getIdPlayer10() {
        return idPlayer10;
    }

    public void setIdPlayer10(int idPlayer10) {
        this.idPlayer10 = idPlayer10;
    }

    public int getIdPlayer11() {
        return idPlayer11;
    }

    public void setIdPlayer11(int idPlayer11) {
        this.idPlayer11 = idPlayer11;
    }

    public int getIdPlayer12() {
        return idPlayer12;
    }

    public void setIdPlayer12(int idPlayer12) {
        this.idPlayer12 = idPlayer12;
    }

    public int getIdPlayer13() {
        return idPlayer13;
    }

    public void setIdPlayer13(int idPlayer13) {
        this.idPlayer13 = idPlayer13;
    }

    public int getIdPlayer14() {
        return idPlayer14;
    }

    public void setIdPlayer14(int idPlayer14) {
        this.idPlayer14 = idPlayer14;
    }

    public int getIdPlayer15() {
        return idPlayer15;
    }

    public void setIdPlayer15(int idPlayer15) {
        this.idPlayer15 = idPlayer15;
    }

    public int getIdPlayer16() {
        return idPlayer16;
    }

    public void setIdPlayer16(int idPlayer16) {
        this.idPlayer16 = idPlayer16;
    }
}
