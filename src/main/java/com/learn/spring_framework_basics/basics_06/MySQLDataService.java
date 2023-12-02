package com.learn.spring_framework_basics.basics_06;

//import org.springframework.stereotype.Component;

//@Component
public class MySQLDataService implements DataService {
    public int[] retrieveData() {
        return new int[] {10, 20, 30, 40, 50};
    }
}
