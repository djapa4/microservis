package com.example.teamservice.service;

import com.example.teamservice.exception.NotFoundException;
import com.example.teamservice.model.Team;
import com.example.teamservice.repository.TeamRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        if (teams.isEmpty()) {
            throw new NotFoundException("Nema dostupnih timova");
        }
        return teams;
    }

    public Team getTeamById(Long id) {
        return teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Tim sa ID " + id + " nije pronađen"));
    }

    public Team addTeam(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> findByName(String name) {
        return teamRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Team> findByCity(String city) {
        return teamRepository.findByCityContainingIgnoreCase(city);
    }
}
