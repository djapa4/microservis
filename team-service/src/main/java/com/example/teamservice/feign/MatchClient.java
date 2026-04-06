package com.example.teamservice.feign;

import com.example.teamservice.dto.MatchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "match-service")
public interface MatchClient {

    @GetMapping("/matches/season/{seasonId}")
    List<MatchDto> getMatchesBySeason(@PathVariable("seasonId") Long seasonId);
}
