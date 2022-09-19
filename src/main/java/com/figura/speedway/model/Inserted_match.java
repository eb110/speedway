package com.figura.speedway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "inserted_match")
@Entity(name = "inserted_match")
public class Inserted_match {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11) UNSIGNED")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;
}
