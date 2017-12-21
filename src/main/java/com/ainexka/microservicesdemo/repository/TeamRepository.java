package com.ainexka.microservicesdemo.repository;

import com.ainexka.microservicesdemo.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {
}
