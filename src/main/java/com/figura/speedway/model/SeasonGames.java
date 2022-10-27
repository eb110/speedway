package com.figura.speedway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SeasonGames {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    private String level;
    private String home;
    private String away;
    private boolean inserted;
    private Date created;
    private Date lastUpdated;
    private String walkover;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Season season;
}
