package com.example.teamservice.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;
import jakarta.validation.constraints.*;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Ime tima je obavezno")
    @Size(max = 100, message = "Ime tima ne sme biti duže od 100 karaktera")
    private String name;

    @NotBlank(message = "Grad je obavezan")
    @Size(max = 50, message = "Naziv grada ne sme biti duži od 50 karaktera")
    private String city;

    @NotBlank(message = "Ime trenera je obavezno")
    @Size(max = 50, message = "Ime trenera ne sme biti duže od 50 karaktera")
    private String coach;

    @Min(value = 1800, message = "Godina osnivanja mora biti realna")
    @Max(value = 2100, message = "Godina osnivanja mora biti realna")
    private Integer foundedYear;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Player> players;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCoach() {
        return coach;
    }

    public Integer getFoundedYear() {
        return foundedYear;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setFoundedYear(Integer foundedYear) {
        this.foundedYear = foundedYear;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

}
