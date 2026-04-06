package com.example.matchservice.controller;

import com.example.matchservice.model.Referee;
import com.example.matchservice.service.RefereeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/referees")
public class RefereeController {

    private final RefereeService refereeService;

    public RefereeController(RefereeService refereeService) {
        this.refereeService = refereeService;
    }

    @GetMapping
    public ResponseEntity<List<Referee>> getAllReferees() {
        return ResponseEntity.ok(refereeService.getAllReferees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Referee> getRefereeById(@PathVariable Long id) {
        return ResponseEntity.ok(refereeService.getRefereeById(id));
    }

    @PostMapping
    public ResponseEntity<Referee> addReferee(@RequestBody Referee referee) {
        Referee saved = refereeService.addReferee(referee);
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping("/search")
    public List<Referee> getRefereesByName(@RequestParam String name) {
        return refereeService.getRefereesByName(name);
    }
}
