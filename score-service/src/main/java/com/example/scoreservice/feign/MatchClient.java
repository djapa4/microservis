package com.example.scoreservice.feign;

import com.example.scoreservice.dto.MatchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "match-service")
public interface MatchClient {

    @GetMapping("/matches/{id}")
    MatchDto getMatchById(@PathVariable("id") Long id);
}
