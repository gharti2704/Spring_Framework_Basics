package com.learn_spring_bean.dependecy_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessClass {
    //////////////// Fields dependency injection ////////////////
//    @Autowired
     private Dependency1Class dependency1Class;

//    @Autowired
     private Dependency2Class dependency2Class;

    //////////////// Constructor dependency injection ////////////////
//     @Autowired
//    public BusinessClass(Dependency1Class dependency1Class, Dependency2Class dependency2Class) {
//    super();
//        this.dependency1Class = dependency1Class;
//        this.dependency2Class = dependency2Class;
//    }

    //////////////// Setter dependency injection ////////////////
     @Autowired
     public void setDependency1Class(Dependency1Class dependency1Class) {
            this.dependency1Class = dependency1Class;
     }
     @Autowired
     public void setDependency2Class(Dependency2Class dependency2Class) {
            this.dependency2Class = dependency2Class;
     }

    //////////////// Method dependency injection ////////////////
    // @Autowired
    // public void methodDependency1Class(Dependency1Class dependency1Class) {}
    // @Autowired
    // public void methodDependency2Class(Dependency2Class dependency2Class) {}

    public String toString() {
        return "BusinessClass{" +
                "dependency1Class=" + dependency1Class +
                ", dependency2Class=" + dependency2Class +
                '}';
    }
}
