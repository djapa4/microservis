package com.example.matchservice.feign;

import com.example.matchservice.dto.ScoreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "score-service")
public interface ScoreClient {

    @GetMapping("/scores/{id}")
    ScoreDto getScoreById(@PathVariable("id") Long id);
}
