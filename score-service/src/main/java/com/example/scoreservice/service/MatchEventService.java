package com.example.scoreservice.service;

import com.example.scoreservice.dto.MatchDto;
import com.example.scoreservice.exception.NotFoundException;
import com.example.scoreservice.feign.MatchClient;
import com.example.scoreservice.model.MatchEvent;
import com.example.scoreservice.repository.MatchEventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MatchEventService {

    private final MatchEventRepository repository;

    public MatchEventService(MatchEventRepository repository) {
        this.repository = repository;
    }

    public List<MatchEvent> getAllEvents() {
        return repository.findAll();
    }

    public MatchEvent addEvent(MatchEvent event) {
        return repository.save(event);
    }

    public MatchEvent getEventById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new NotFoundException("MatchEvent sa ID " + id + " nije pronađen"));
    }
}
