package com.example.matchservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@Entity
public class MatchInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "ID domaćeg tima je obavezan")
    @Column(name = "home_team_id")
    private Long home_team_id;

    @NotNull(message = "ID gostujućeg tima je obavezan")
    @Column(name = "away_team_id")
    private Long away_team_id;

    @NotNull(message = "Datum meča je obavezan")
    private LocalDate match_date;

    @NotBlank(message = "Naziv stadiona je obavezan")
    private String stadium_name;

    @ManyToOne
    @JoinColumn(name = "referee_id")
    @NotNull(message = "Sudija mora biti naveden")
    private Referee referee;

    @ManyToOne
    @JoinColumn(name = "season_id")
    @NotNull(message = "Sezona mora biti navedena")
    private Season season;


    public MatchInfo() {
    }

    public MatchInfo(Long home_team_id, Long away_team_id, LocalDate match_date, String stadium_name, Referee referee, Season season) {
        this.home_team_id = home_team_id;
        this.away_team_id = away_team_id;
        this.match_date = match_date;
        this.stadium_name = stadium_name;
        this.referee = referee;
        this.season = season;
    }

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

    public Referee getReferee() {
        return referee;
    }

    public Season getSeason() {
        return season;
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

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
