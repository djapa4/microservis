package com.example.matchservice.service;

import com.example.matchservice.exception.NotFoundException;
import com.example.matchservice.model.Season;
import com.example.matchservice.repository.SeasonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {

    private final SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository) {
        this.seasonRepository = seasonRepository;
    }

    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }

    public Season getSeasonById(Long id) {
        return seasonRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Sezona sa ID " + id + " nije pronađena"));
    }

    public Season addSeason(Season season) {
        return seasonRepository.save(season);
    }
}
