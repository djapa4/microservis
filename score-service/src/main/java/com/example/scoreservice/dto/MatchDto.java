package com.example.scoreservice.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class MatchDto {

    private Long id;
    private Long home_team_id;
    private Long away_team_id;
    private LocalDate match_date;
    private String stadium_name;
    private Long referee_id;
    private Long season_id;

    public Long getId() {
        return id;
    }

    public Long getHome_team_id() {
        return home_team_id;
    }

    public Long getAway_team_id() {
        return away_team_id;
    }

    public LocalDate getMatch_date() {
        return match_date;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public Long getReferee_id() {
        return referee_id;
    }

    public Long getSeason_id() {
        return season_id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHome_team_id(Long home_team_id) {
        this.home_team_id = home_team_id;
    }

    public void setAway_team_id(Long away_team_id) {
        this.away_team_id = away_team_id;
    }

    public void setMatch_date(LocalDate match_date) {
        this.match_date = match_date;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public void setReferee_id(Long referee_id) {
        this.referee_id = referee_id;
    }

    public void setSeason_id(Long season_id) {
        this.season_id = season_id;
    }
}
