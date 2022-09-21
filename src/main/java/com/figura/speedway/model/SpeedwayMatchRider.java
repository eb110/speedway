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
@Entity(name = "speedway_match_rider")
public class SpeedwayMatchRider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_speedway_rider_id", nullable = false)
    private SpeedwayRider speedwayRider;

    @ManyToOne
    @JoinColumn(name = "fk_speedway_match_id", nullable = false)
    private SpeedwayMatch speedwayMatch;

    @ManyToOne
    @JoinColumn(name = "fk_speedway_team_id", nullable = false)
    private SpeedwayTeam speedwayTeam;

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
