package com.example.scoreservice.repository;

import com.example.scoreservice.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
