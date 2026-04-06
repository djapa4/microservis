package com.example.teamservice.repository;

import com.example.teamservice.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByNameContainingIgnoreCase(String name);
    List<Team> findByCityContainingIgnoreCase(String city);
}
