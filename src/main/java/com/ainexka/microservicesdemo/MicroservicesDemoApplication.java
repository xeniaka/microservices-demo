package com.ainexka.microservicesdemo;

import com.ainexka.microservicesdemo.model.Player;
import com.ainexka.microservicesdemo.model.Team;
import com.ainexka.microservicesdemo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@ComponentScan
public class MicroservicesDemoApplication {

	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	private void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Big Easy", "Showman"));
		players.add(new Player("Buckets", "Guard"));
		players.add(new Player("Dizzy", "Guard"));

		List<Team> list = new ArrayList<>();
		list.add(new Team("Globetrotters", "Harlem", "", players));
		list.add(new Team("Generals", "Washington", "", null));

		teamRepository.save(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesDemoApplication.class, args);
	}
}
