package com.example.matchservice.service;

import com.example.matchservice.exception.NotFoundException;
import com.example.matchservice.model.MatchInfo;
import com.example.matchservice.repository.MatchInfoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MatchInfoService {

    private final MatchInfoRepository matchInfoRepository;

    public MatchInfoService(MatchInfoRepository matchInfoRepository) {
        this.matchInfoRepository = matchInfoRepository;
    }

    public List<MatchInfo> getAllMatches() {
        return matchInfoRepository.findAll();
    }

    public MatchInfo getMatchById(Long id) {
        return matchInfoRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Utakmica sa ID " + id + " nije pronađena"));
    }

    public List<MatchInfo> getMatchesBySeasonId(Long seasonId) {
        List<MatchInfo> matches = matchInfoRepository.findBySeasonId(seasonId);
        if (matches.isEmpty()) {
            throw new NotFoundException("Nema utakmica za sezonu sa ID " + seasonId);
        }
        return matches;
    }

    public MatchInfo addMatch(MatchInfo matchInfo) {
        return matchInfoRepository.save(matchInfo);
    }

    public List<MatchInfo> getMatchesByReferee(Long refereeId) {
        return matchInfoRepository.findByRefereeId(refereeId);
    }

    public List<MatchInfo> getMatchesBetweenDates(LocalDate start, LocalDate end) {
        return matchInfoRepository.findMatchesBetweenDates(start, end);
    }
}
