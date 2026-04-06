package com.example.teamservice.repository;

import com.example.teamservice.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(Long teamId);
    List<Player> findByNumber(int number);
    List<Player> findByPositionIgnoreCase(String position);
}
