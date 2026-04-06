package com.example.scoreservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Match ID ne sme biti null")
    private Long match_id;

    @NotNull(message = "Home score ne sme biti null")
    @PositiveOrZero(message = "Home score mora biti 0 ili više")
    private Integer home_score;

    @NotNull(message = "Away score ne sme biti null")
    @PositiveOrZero(message = "Away score mora biti 0 ili više")
    private Integer away_score;
    public Score() {
    }

    public Score(Long match_id, Integer home_score, Integer away_score) {
        this.match_id = match_id;
        this.home_score = home_score;
        this.away_score = away_score;
    }

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