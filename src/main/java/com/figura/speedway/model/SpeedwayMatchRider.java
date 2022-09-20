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
public class SpeedwayMatchRider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @Column(name = "FK_speedwayRider_speedwayMatchRider", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int fk_SpeedwayRider_SpeedwayMatchRider;
    @Column(name = "FK_speedwayTeam_speedwayMatchRider", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int fk_SpeedwayTeam_SpeedwayMatchRider;
    @Column(name = "fk_speedwayMatch_speedwayMatchRider", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int fk_SpeedwayMatch_SpeedwayMatchRider;

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
