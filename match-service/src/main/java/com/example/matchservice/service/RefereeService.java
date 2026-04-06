package com.example.matchservice.service;

import com.example.matchservice.exception.NotFoundException;
import com.example.matchservice.model.Referee;
import com.example.matchservice.repository.RefereeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefereeService {

    private final RefereeRepository refereeRepository;

    public RefereeService(RefereeRepository refereeRepository) {
        this.refereeRepository = refereeRepository;
    }

    public List<Referee> getAllReferees() {
        return refereeRepository.findAll();
    }

    public Referee getRefereeById(Long id) {
        return refereeRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Sudija sa ID " + id + " nije pronađen"));
    }

    public Referee addReferee(Referee referee) {
        return refereeRepository.save(referee);
    }

    public List<Referee> getRefereesByName(String name) {
        return refereeRepository.findByNameContainingIgnoreCase(name);
    }
}
