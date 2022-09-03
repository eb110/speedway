package com.figura.speedway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "speedway_match_rider")
@Entity(name = "speedway_match_rider")
public class Speedway_match_rider {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "fk_id_rider")
    private int fkIdRider;
    @Column(name = "fk_id_team")
    private int fkIdTeam;
    @Column(name = "fk_id_match")
    private int fkIdMatch;
    @Column(name = "rider_match_number")
    private int riderMatchNumber;
    @Column(name = "home_away_side")
    private String homeAwaySide;
    @Column(name = "pkt")
    private String pkt;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;

}
