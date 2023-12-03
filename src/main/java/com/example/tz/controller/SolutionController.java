package com.example.tz.controller;

import com.example.tz.dto.SolutionResponse;
import com.example.tz.service.SolutionService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolutionController {
    private final SolutionService solutionService;

    public SolutionController(SolutionService solutionService) {
        this.solutionService = solutionService;
    }


    @GetMapping
    ResponseEntity<String> findDuplicates(@PathVariable("string") String input){
        String ans = solutionService.solve(input);
        return new ResponseEntity<>(ans, HttpStatus.ACCEPTED);
    }
}
