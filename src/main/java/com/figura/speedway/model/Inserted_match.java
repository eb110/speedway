package com.figura.speedway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "inserted_match")
@Entity(name = "inserted_match")
public class Inserted_match {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "created")
    private Date created;
    @Column(name = "last_updated")
    private Date lastUpdated;
}
