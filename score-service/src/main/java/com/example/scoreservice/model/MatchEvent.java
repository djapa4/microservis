package com.example.scoreservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class MatchEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Match ID ne sme biti null")
    private Long match_id;

    @NotBlank(message = "Ime igrača ne sme biti prazno")
    private String player_name;

    @NotBlank(message = "Tip događaja ne sme biti prazan")
    private String event_type; // goal, yellow_card, red_card

    @NotNull(message = "Minut događaja ne sme biti null")
    @Min(value = 1, message = "Minut događaja mora biti najmanje 1")
    @Max(value = 90, message = "Minut događaja može biti najviše 90")
    private Integer event_minute;

    public MatchEvent() {
    }

    public MatchEvent(Long match_id, String player_name, String event_type, Integer event_minute) {
        this.match_id = match_id;
        this.player_name = player_name;
        this.event_type = event_type;
        this.event_minute = event_minute;
    }

    public Long getId() {
        return id;
    }

    public Long getMatch_id() {
        return match_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public String getEvent_type() {
        return event_type;
    }

    public Integer getEvent_minute() {
        return event_minute;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public void setMatch_id(Long match_id) {
        this.match_id = match_id;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public void setEvent_minute(Integer event_minute) {
        this.event_minute = event_minute;
    }
}