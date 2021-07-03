package com.microdegree.tutorialspring.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleBeanConfig {
    @Bean
    public SampleJavaPojo sampleJavaPojo() {
        return new SampleJavaPojo("name", "meta-data");
    }

    @Bean
    public SampleJavaPojo sampleJavaPojo2() {
        return new SampleJavaPojo("name2", "meta-data");
    }

}
