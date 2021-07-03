package com.microdegree.tutorialspring.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleControllerClass {

    @PostMapping("/profile")
    public int postProfile() {
        //logic
        return 200;
    }

    @GetMapping("/profile")
    public Map<String, Object> getProfile() {
        Map<String, Object> profileMap = new HashMap<>();
        profileMap.put("name", "microdegree");
        return profileMap;
    }

    @DeleteMapping("/profile")
    public int deleteProfile() {
        //random logic
        return 200;
    }

    @PutMapping("/profile")
    public int putProfile() {
        //logic
        return 200;
    }

    //

}
