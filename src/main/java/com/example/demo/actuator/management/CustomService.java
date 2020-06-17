package com.example.demo.actuator.management;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class CustomService {
    private boolean healthy = true;

}
