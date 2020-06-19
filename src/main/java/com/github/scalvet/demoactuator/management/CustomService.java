package com.github.scalvet.demoactuator.management;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class CustomService {
    private boolean healthy = true;

}
