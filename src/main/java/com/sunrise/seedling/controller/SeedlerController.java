package com.sunrise.seedling.controller;

import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.service.SeedlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeedlerController {

    @Autowired
    SeedlerService seedlerService;

    @GetMapping("/seedlings")
    public List<Seedler> getSeedler() {
        return seedlerService.getSeedlings();
    }
}
