package com.microdegree.tutorialspring;

import com.microdegree.tutorialspring.configurations.SampleJavaPojo;
import com.microdegree.tutorialspring.services.SampleServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.microdegree.*")
public class TutorialSpringApplication implements CommandLineRunner {
    @Autowired
    private SampleServiceClass sampleServiceClass;
    @Autowired
    @Qualifier("sampleJavaPojo")
    private SampleJavaPojo sampleJavaPojo;

    public static void main(String[] args) {
        SpringApplication.run(TutorialSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sampleServiceClass.printBusinessLog();
        sampleJavaPojo.printSomething();
    }
}
