package com.example.teamservice.controller;

import com.example.teamservice.client.MatchServiceClient;
import com.example.teamservice.dto.MatchDto;
import com.example.teamservice.model.Team;
import com.example.teamservice.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;
    private final MatchServiceClient matchServiceClient;

    public TeamController(TeamService teamService, MatchServiceClient matchServiceClient) {
        this.teamService = teamService;
        this.matchServiceClient = matchServiceClient;
    }

    @GetMapping
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/{id}")
    public Team getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id);
    }

    @PostMapping
    public Team addTeam(@RequestBody Team team) {
        return teamService.addTeam(team);
    }

    @GetMapping("/search/name")
    public List<Team> searchByName(@RequestParam String name) {
        return teamService.findByName(name);
    }

    @GetMapping("/search/city")
    public List<Team> searchByCity(@RequestParam String city) {
        return teamService.findByCity(city);
    }

}
