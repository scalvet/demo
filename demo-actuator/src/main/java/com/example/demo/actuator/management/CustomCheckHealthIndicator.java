package com.example.demo.actuator.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomCheckHealthIndicator implements HealthIndicator {
    private final CustomService service;

    @Autowired
    CustomCheckHealthIndicator(CustomService service) {
        this.service = service;
    }

    @Override
    public Health health() {
        log.info("isHealthy() -> {}", service.isHealthy());
        return service.isHealthy() ? Health.up().build() : Health.down().build();
    }
}