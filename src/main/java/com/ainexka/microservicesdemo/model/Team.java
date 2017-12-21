package com.ainexka.microservicesdemo.model;


import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String location;
    private String mascot;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamId")
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, String location, String mascot, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.mascot = mascot;
        this.players = players;
    }
}
