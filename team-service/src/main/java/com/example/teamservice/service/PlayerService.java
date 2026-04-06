package com.example.teamservice.service;

import com.example.teamservice.exception.NotFoundException;
import com.example.teamservice.model.Player;
import com.example.teamservice.repository.PlayerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getAllPlayers() {
        List<Player> players = playerRepository.findAll();
        if (players.isEmpty()) {
            throw new NotFoundException("Nema dostupnih igrača");
        }
        return players;
    }

    public List<Player> getPlayersByTeamId(Long teamId) {
        List<Player> players = playerRepository.findByTeamId(teamId);
        if (players.isEmpty()) {
            throw new NotFoundException("Nema igrača za tim sa ID: " + teamId);
        }
        return players;
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> getPlayersByNumber(int number) {
        return playerRepository.findByNumber(number);
    }

    public List<Player> getPlayersByPosition(String position) {
        return playerRepository.findByPositionIgnoreCase(position);
    }
}

