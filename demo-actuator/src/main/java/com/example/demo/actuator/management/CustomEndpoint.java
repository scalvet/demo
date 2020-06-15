package com.example.demo.actuator.management;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;


@Component
@Endpoint(id = "custom")
@Slf4j
public class CustomEndpoint {
    private CustomService service;

    @Autowired
    CustomEndpoint(CustomService service) {
        this.service = service;
    }

    @WriteOperation
    public void setHealthy(boolean healthy) {
        log.info("setHealthy() -> {}", healthy);
        this.service.setHealthy(healthy);
    }

    @ReadOperation
    public boolean isHealthy() {
        log.info("isHealthy() -> {}", this.service.isHealthy());
        return this.service.isHealthy();
    }

}
