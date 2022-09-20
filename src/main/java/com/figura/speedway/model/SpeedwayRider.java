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
@Table(name = "speedway_rider")
@Entity(name = "speedway_rider")
public class SpeedwayRider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @OneToMany(targetEntity = SpeedwayMatchRider.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_speedwayRider_speedwayMatchRider", referencedColumnName = "id")
    private List<SpeedwayMatchRider> matchRiderList;

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
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;


}
