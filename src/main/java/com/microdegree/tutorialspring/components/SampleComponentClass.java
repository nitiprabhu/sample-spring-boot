package com.microdegree.tutorialspring.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SampleComponentClass {

    @PostConstruct
    public void init() {
        System.out.println("Sample component bean created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Sample component bean destroyed");
    }
}
