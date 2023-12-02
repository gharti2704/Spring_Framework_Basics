package com.learn.spring_framework_basics.basics_06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BusinessService {

    private DataService dataService;

    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;

        System.out.println("Setter Injection");
    }

    public DataService getDataService() {
        return dataService;
    }

}
