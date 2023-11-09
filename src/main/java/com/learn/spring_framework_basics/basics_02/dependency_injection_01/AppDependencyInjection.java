package com.learn.spring_framework_basics.basics_02.dependency_injection_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    Dependency01 dependency01;
    Dependency02 dependency02;

    /////////////////////// FIELD INJECTION ////////////////////////////
//    @Autowired
//    Dependency01 dependency01;
//
//    @Autowired
//    Dependency02 dependency02;

    ////////////////////// CONSTRUCTOR INJECTION ///////////////////////
@Autowired
    public YourBusinessClass (Dependency01 dependency01, Dependency02 dependency02) {
        super();
        this.dependency01 = dependency01;
        this.dependency02 = dependency02;

        System.out.println("Constructor Injection - YourBusinessClass");
    }

    ///////////////////// SETTER INJECTION ///////////////////////////
//    public Dependency01 getDependency01() {
//        return dependency01;
//    }
//
//    @Autowired
//    public void setDependency01(Dependency01 dependency01) {
//        this.dependency01 = dependency01;
//
//        System.out.println("Setter Injection - setDependency01");
//    }
//
//    public Dependency02 getDependency02() {
//        return dependency02;
//    }
//
//    @Autowired
//    public void setDependency02(Dependency02 dependency02) {
//        this.dependency02 = dependency02;
//        System.out.println("Setter Injection - setDependency02");
//    }



    public String toString() {
        return "Using " + dependency01 + " and " + dependency02;
    }

}

@Component
class Dependency01 {

}

@Component
class Dependency02 {

}

@Configuration
@ComponentScan
public class AppDependencyInjection {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppDependencyInjection.class);
        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
