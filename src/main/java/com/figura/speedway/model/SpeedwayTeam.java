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
@Table(name = "speedway_team")
@Entity(name = "speedway_team")
public class SpeedwayTeam {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @OneToMany(targetEntity = SpeedwayMatchRider.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_speedwayTeam_speedwayMatchRider", referencedColumnName = "id")
    private List<SpeedwayMatchRider> matchRiderList;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;

}
