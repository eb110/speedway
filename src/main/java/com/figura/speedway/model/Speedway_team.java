package com.figura.speedway.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "speedway_team")
@Entity(name = "speedway_team")
public class Speedway_team {


    @Id
    @Column(name = "id")
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "full_name")
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public Speedway_team() {}
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
