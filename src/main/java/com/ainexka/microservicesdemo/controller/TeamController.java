package com.ainexka.microservicesdemo.controller;

import com.ainexka.microservicesdemo.model.Team;
import com.ainexka.microservicesdemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/team/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }

}
