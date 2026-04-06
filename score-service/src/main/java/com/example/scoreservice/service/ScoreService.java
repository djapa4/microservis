package com.example.scoreservice.service;

import com.example.scoreservice.dto.MatchDto;
import com.example.scoreservice.exception.NotFoundException;
import com.example.scoreservice.feign.MatchClient;
import com.example.scoreservice.model.Score;
import com.example.scoreservice.repository.ScoreRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ScoreService {

    private final ScoreRepository repository;
    private final MatchClient matchClient;

    public ScoreService(ScoreRepository repository, MatchClient matchClient) {
        this.repository = repository;
        this.matchClient = matchClient;
    }

    public List<Score> getAllScores() {
        return repository.findAll();
    }

    public Score getScoreById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Score sa ID " + id + " nije pronađen"));
    }

    public Score addScore(Score score) {
        return repository.save(score);
    }

    public MatchDto getMatchFromMatchService(Long matchId) {
        return matchClient.getMatchById(matchId);
    }
}
