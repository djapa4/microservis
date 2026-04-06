package com.example.matchservice.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class ScoreDto {

    private Long id;
    private Long match_id;
    private Integer home_score;
    private Integer away_score;

    public Long getId() {
        return id;
    }

    public Long getMatch_id() {
        return match_id;
    }

    public Integer getHome_score() {
        return home_score;
    }

    public Integer getAway_score() {
        return away_score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMatch_id(Long match_id) {
        this.match_id = match_id;
    }

    public void setHome_score(Integer home_score) {
        this.home_score = home_score;
    }

    public void setAway_score(Integer away_score) {
        this.away_score = away_score;
    }
}
