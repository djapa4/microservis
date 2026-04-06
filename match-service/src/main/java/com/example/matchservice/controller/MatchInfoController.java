package com.example.matchservice.controller;

import com.example.matchservice.model.MatchInfo;
import com.example.matchservice.service.MatchInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchInfoController {

    private final MatchInfoService matchInfoService;

    public MatchInfoController(MatchInfoService matchInfoService) {
        this.matchInfoService = matchInfoService;
    }

    @GetMapping
    public ResponseEntity<List<MatchInfo>> getAllMatches() {
        return ResponseEntity.ok(matchInfoService.getAllMatches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MatchInfo> getMatchById(@PathVariable Long id) {
        return ResponseEntity.ok(matchInfoService.getMatchById(id));
    }

    @GetMapping("/season/{seasonId}")
    public ResponseEntity<List<MatchInfo>> getMatchesBySeason(@PathVariable Long seasonId) {
        return ResponseEntity.ok(matchInfoService.getMatchesBySeasonId(seasonId));
    }

    @PostMapping
    public ResponseEntity<MatchInfo> addMatch(@RequestBody MatchInfo matchInfo) {
        MatchInfo saved = matchInfoService.addMatch(matchInfo);
        return ResponseEntity.status(201).body(saved);
    }


    @GetMapping("/referee/{refereeId}")
    public ResponseEntity<List<MatchInfo>> getMatchesByReferee(@PathVariable Long refereeId) {
        return ResponseEntity.ok(matchInfoService.getMatchesByReferee(refereeId));
    }

    @GetMapping("/between")
    public ResponseEntity<List<MatchInfo>> getMatchesBetweenDates(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end) {
        return ResponseEntity.ok(matchInfoService.getMatchesBetweenDates(start, end));
    }
}
