package com.example.matchservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Referee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Ime sudije je obavezno")
    private String name;

    @Min(value = 0, message = "Godine iskustva ne mogu biti negativne")
    private int experience_years;
    public Referee() {
    }

    public Referee(String name, int experience_years) {
        this.name = name;
        this.experience_years = experience_years;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience_years() {
        return experience_years;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExperience_years(int experience_years) {
        this.experience_years = experience_years;
    }

    public void setName(String name) {
        this.name = name;
    }
}