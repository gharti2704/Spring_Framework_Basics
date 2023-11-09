package com.learn.spring_framework_basics.basics_02.dependency_injection_02;

import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BusinessCalculationService {

    private final DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
