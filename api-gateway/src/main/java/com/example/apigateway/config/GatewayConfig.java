package com.example.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("match-service", r -> r.path("/matches/**")
                        .uri("lb://MATCH-SERVICE"))
                .route("match-service", r -> r.path("/referees/**")
                        .uri("lb://MATCH-SERVICE"))
                .route("match-service", r -> r.path("/seasons/**")
                        .uri("lb://MATCH-SERVICE"))
                .route("score-service-scores", r -> r.path("/scores/**")
                        .uri("lb://SCORE-SERVICE"))
                .route("score-service-events", r -> r.path("/events/**")
                        .uri("lb://SCORE-SERVICE"))
                .route("team-service", r -> r.path("/teams/**")
                        .uri("lb://TEAM-SERVICE"))
                .route("team-service", r -> r.path("/players/**")
                        .uri("lb://TEAM-SERVICE"))
                .build();
    }
}