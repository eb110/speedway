package com.figura.speedway.model;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpeedwayMatchRider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private SpeedwayRider speedwayRider;

    @ManyToOne
    @JoinColumn(nullable = false)
    private SpeedwayTeam speedwayTeam;

    @ManyToOne
    @JoinColumn(nullable = false)
    private SpeedwayMatch speedwayMatch;

    private int riderMatchNumber;
    private String homeAwaySide;
    private String pkt;
    private Date created;
    private Date lastUpdated;
}
