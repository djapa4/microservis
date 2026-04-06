package com.example.matchservice.controller;

import com.example.matchservice.dto.PlayerDto;
import com.example.matchservice.dto.ScoreDto;
import com.example.matchservice.dto.TeamDto;
import com.example.matchservice.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    private final FeignService service;

    public FeignController(FeignService service) {
        this.service = service;
    }

    @GetMapping("/integration/teams/{id}")
    public TeamDto getTeam(@PathVariable Long id) {
        return service.getTeam(id);
    }

    @GetMapping("/integration/teams/{id}/players")
    public List<PlayerDto> getPlayers(@PathVariable Long id) {
        return service.getPlayers(id);
    }

    @GetMapping("/integration/score/{matchId}")
    public ScoreDto getScoreForMatch(@PathVariable Long matchId) {
        return service.getScoreByMatchId(matchId);
    }
}
