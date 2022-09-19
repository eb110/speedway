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
public class Speedway_team {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @OneToMany(targetEntity = Speedway_match_rider.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_team", referencedColumnName = "id")
    private List<Speedway_match_rider> matchRiderList;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;

}
