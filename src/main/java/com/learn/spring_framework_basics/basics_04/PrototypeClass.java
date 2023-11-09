package com.learn.spring_framework_basics.basics_04;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeClass {
//Prototype - Possibly many object instances per Spring IoC container
}
