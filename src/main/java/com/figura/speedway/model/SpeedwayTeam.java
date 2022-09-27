package com.figura.speedway.model;

import lombok.*;
import javax.persistence.*;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SpeedwayTeam {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    private String name;
    private String fullName;
    private Date created;
    private Date lastUpdated;
}
