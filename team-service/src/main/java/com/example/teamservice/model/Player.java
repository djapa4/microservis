package com.example.teamservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Ime je obavezno")
    @Size(max = 50, message = "Ime ne sme biti duže od 50 karaktera")
    private String first_name;

    @NotBlank(message = "Prezime je obavezno")
    @Size(max = 50, message = "Prezime ne sme biti duže od 50 karaktera")
    private String last_name;

    @NotBlank(message = "Pozicija je obavezna")
    @Size(max = 20, message = "Pozicija ne sme biti duža od 20 karaktera")
    private String position;

    @Min(value = 1, message = "Broj igrača mora biti najmanje 1")
    @Max(value = 99, message = "Broj igrača ne sme biti veći od 99")
    private int number;

    @ManyToOne
    @JoinColumn(name = "team_id")
    @JsonBackReference
    private Team team;

    public Player() {
    }

    public Player(String first_name, String last_name, String position, int number, Team team) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.position = position;
        this.number = number;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public Team getTeam() {
        return team;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}