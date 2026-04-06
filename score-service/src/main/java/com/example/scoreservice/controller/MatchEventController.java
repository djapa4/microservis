package com.example.scoreservice.controller;

import com.example.scoreservice.dto.MatchDto;
import com.example.scoreservice.model.MatchEvent;
import com.example.scoreservice.service.MatchEventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/events")
public class MatchEventController {

    private final MatchEventService service;

    public MatchEventController(MatchEventService service) {
        this.service = service;
    }

    @GetMapping
    public List<MatchEvent> getAllEvents() {
        return service.getAllEvents();
    }

    @GetMapping("/{id}")
    public MatchEvent getEvent(@PathVariable Long id) {
        return service.getEventById(id);
    }

    @PostMapping
    public MatchEvent addEvent(@RequestBody MatchEvent event) {
        return service.addEvent(event);
    }
}
