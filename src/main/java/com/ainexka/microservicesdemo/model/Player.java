package com.ainexka.microservicesdemo.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Player {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String position;

    public Player() {
    }

    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }
}
