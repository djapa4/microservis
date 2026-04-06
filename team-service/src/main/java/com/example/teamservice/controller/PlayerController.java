package com.example.teamservice.controller;

import com.example.teamservice.model.Player;
import com.example.teamservice.service.PlayerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/team/{teamId}")
    public List<Player> getPlayersByTeam(@PathVariable Long teamId) {
        return playerService.getPlayersByTeamId(teamId);
    }

    @PostMapping
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping("/number")
    public List<Player> getPlayersByNumber(@RequestParam int number) {
        return playerService.getPlayersByNumber(number);
    }

    @GetMapping("/position")
    public List<Player> getPlayersByPosition(@RequestParam String position) {
        return playerService.getPlayersByPosition(position);
    }

}
