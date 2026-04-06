package com.example.matchservice.controller;

import com.example.matchservice.model.Season;
import com.example.matchservice.service.SeasonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seasons")
public class SeasonController {

    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService) {
        this.seasonService = seasonService;
    }

    @GetMapping
    public ResponseEntity<List<Season>> getAllSeasons() {
        return ResponseEntity.ok(seasonService.getAllSeasons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Season> getSeasonById(@PathVariable Long id) {
        return ResponseEntity.ok(seasonService.getSeasonById(id));
    }

    @PostMapping
    public ResponseEntity<Season> addSeason(@RequestBody Season season) {
        Season saved = seasonService.addSeason(season);
        return ResponseEntity.status(201).body(saved);
    }
}
