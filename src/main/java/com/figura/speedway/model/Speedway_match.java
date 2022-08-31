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
public class Speedway_match {

    @Id
    @Column(name = "id")
    private int id;

    @OneToMany(targetEntity = Speedway_match_rider.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_match", referencedColumnName = "id")
    private List<Speedway_match_rider> matchRiderList;

    @Column(name = "date_of_match")
    private Date dateOfMatch;

    @Column(name = "round")
    private String round;

    @Column(name = "type_of_game")
    private String typeOfGame;

}
