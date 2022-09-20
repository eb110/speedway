package com.figura.speedway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "speedway_match")
@Entity(name = "speedway_match")
public class SpeedwayMatch {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @OneToMany(targetEntity = SpeedwayMatchRider.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_speedwayMatch_speedwayMatchRider", referencedColumnName = "id")
    private List<SpeedwayMatchRider> matchRiderList;

    @Column(name = "date_of_match")
    private Date dateOfMatch;

    @Column(name = "round")
    private String round;

    @Column(name = "type_of_game")
    private String typeOfGame;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;

}
