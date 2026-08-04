package com.example.mainservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Backend is running!");
    }

    @GetMapping("health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("OK");
    }
}
