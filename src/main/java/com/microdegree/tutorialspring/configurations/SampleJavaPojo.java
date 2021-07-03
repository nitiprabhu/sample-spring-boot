package com.microdegree.tutorialspring.configurations;

public class SampleJavaPojo {
    private String name;

    public SampleJavaPojo(String name, String metaData) {
        this.name = name;
        this.metaData = metaData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetaData() {
        return metaData;
    }

    public void setMetaData(String metaData) {
        this.metaData = metaData;
    }

    private String metaData;

    public void printSomething(){
        System.out.println("Bean:"  + this.name);
    }
}
