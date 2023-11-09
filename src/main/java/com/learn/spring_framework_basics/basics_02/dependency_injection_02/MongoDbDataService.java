package com.learn.spring_framework_basics.basics_02.dependency_injection_02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

    public int[] retrieveData() {
        return new int[] {11, 22, 33, 55, 44};
    }
}
