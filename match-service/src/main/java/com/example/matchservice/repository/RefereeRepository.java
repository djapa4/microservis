package com.example.matchservice.repository;

import com.example.matchservice.model.Referee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefereeRepository extends JpaRepository<Referee, Long> {
    List<Referee> findByNameContainingIgnoreCase(String name);
}
