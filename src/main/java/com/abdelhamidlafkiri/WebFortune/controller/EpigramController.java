package com.abdelhamidlafkiri.WebFortune.controller;

import com.abdelhamidlafkiri.WebFortune.model.Epigram;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class EpigramController {

    @GetMapping("/epigram")
    public String getEpigram() {
        return Epigram.getRandomText();
    }
}
