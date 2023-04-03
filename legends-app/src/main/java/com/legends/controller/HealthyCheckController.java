package com.legends.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthyCheckController {
    @GetMapping("/healthy-check")
    public String check() {
        return "status ok";
    }
}
