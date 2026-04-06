package com.example.teamservice.client;

import com.example.teamservice.dto.MatchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "match-service", url = "http://localhost:8082")
public interface MatchServiceClient {

    @GetMapping("/matches/team/{teamId}")
    List<MatchDto> getMatchesByTeam(@PathVariable("teamId") Long teamId);
}
