package com.example.teamservice.dto;

import java.time.LocalDate;

public class MatchDto {
    private Long id;
    private Long home_team_id;
    private Long away_team_id;
    private LocalDate match_date;
    private String stadium_name;

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
}
