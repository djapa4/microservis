package com.example.matchservice.dto;

public class TeamDto {
    private Long id;
    private String name;
    private String city;
    private String coach;
    private int founded_year;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCoach() { return coach; }
    public void setCoach(String coach) { this.coach = coach; }

    public int getFounded_year() {
        return founded_year;
    }

    public void setFounded_year(int founded_year) {
        this.founded_year = founded_year;
    }
}
