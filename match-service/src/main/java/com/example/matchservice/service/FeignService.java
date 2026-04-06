package com.example.matchservice.service;

import com.example.matchservice.dto.PlayerDto;
import com.example.matchservice.dto.ScoreDto;
import com.example.matchservice.dto.TeamDto;
import com.example.matchservice.feign.ScoreClient;
import com.example.matchservice.feign.TeamClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {

    private final TeamClient teamClient;
    private final ScoreClient scoreClient;

    public FeignService(TeamClient teamClient, ScoreClient scoreClient) {
        this.teamClient = teamClient;
        this.scoreClient = scoreClient;
    }

    public TeamDto getTeam(Long teamId) {
        return teamClient.getTeamById(teamId);
    }

    public List<PlayerDto> getPlayers(Long teamId) {
        return teamClient.getPlayersByTeam(teamId);
    }

    public ScoreDto getScoreByMatchId(Long matchId) {
        return scoreClient.getScoreById(matchId);
    }

}
