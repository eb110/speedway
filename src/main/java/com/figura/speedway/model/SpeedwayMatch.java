package com.figura.speedway.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpeedwayMatch {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    private Date dateOfMatch;
    private String round;
    private String typeOfGame;
    private Date created;
    private Date lastUpdated;
}
