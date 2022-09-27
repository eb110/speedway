package com.figura.speedway.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpeedwayRider {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private String countryOfBirth;
    private String placeOfBirth;
    private Date ripDate;
    private String placeOfRip;
    private double points;
    private int heats;
    private int games;
    private int bonuses;
    private int fullPerfects;
    private int paidPerfects;
    private Date created;
    private Date lastUpdated;


}
