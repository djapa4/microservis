package com.example.matchservice.feign;

import com.example.matchservice.dto.PlayerDto;
import com.example.matchservice.dto.TeamDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "team-service")
public interface TeamClient {

    @GetMapping("/teams/{id}")
    TeamDto getTeamById(@PathVariable("id") Long id);

    @GetMapping("/players/team/{teamId}")
    List<PlayerDto> getPlayersByTeam(@PathVariable("teamId") Long teamId);
}

