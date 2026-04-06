package com.example.scoreservice.controller;

import com.example.scoreservice.dto.MatchDto;
import com.example.scoreservice.feign.MatchClient;
import com.example.scoreservice.model.Score;
import com.example.scoreservice.service.ScoreService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ScoreController {

    private final ScoreService service;
    private final MatchClient matchClient;

    public ScoreController(ScoreService service, MatchClient matchClient) {
        this.service = service;
        this.matchClient = matchClient;
    }

    @GetMapping("/scores")
    public List<Score> getAllScores() {
        return service.getAllScores();
    }

    @GetMapping("/scores/{id}")
    public Score getScore(@PathVariable Long id) {
        return service.getScoreById(id);
    }

    @PostMapping("/scores")
    public Score addScore(@RequestBody Score score) {
        return service.addScore(score);
    }

    @GetMapping("/match/{matchId}")
    public MatchDto getMatch(@PathVariable Long matchId) {
        return service.getMatchFromMatchService(matchId);
    }

}
