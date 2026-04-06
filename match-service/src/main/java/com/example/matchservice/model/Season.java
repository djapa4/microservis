package com.example.matchservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Min(value = 1900, message = "Početna godina mora biti validna")
    private int year_start;

    @Min(value = 1900, message = "Završna godina mora biti validna")
    private int year_end;
    public Season() {
    }

    public Season(int year_start, int year_end) {
        this.year_start = year_start;
        this.year_end = year_end;
    }

    public Long getId() {
        return id;
    }

    public int getYear_start() {
        return year_start;
    }

    public int getYear_end() {
        return year_end;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setYear_start(int year_start) {
        this.year_start = year_start;
    }

    public void setYear_end(int year_end) {
        this.year_end = year_end;
    }
}
