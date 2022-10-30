package com.figura.speedway.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TotalResult {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    private int game;
    private double point;
    private int bonus;
    private int heat;
    private int fullPerfect;
    private int paidPerfect;
    private Date created;
    private Date lastUpdated;
}
