package com.sunrise.seedling.service;

import com.sunrise.seedling.model.Seedler;

import java.util.ArrayList;
import java.util.List;

public interface SeedlerService {

    static List<Seedler> defaultSeedlers() {
        ArrayList<Seedler> seedlers = new ArrayList<>();

        Seedler seedler1 = new Seedler(1L, "Lido Mazzucco", "Associate Developer", "Platform", "Puzzle", "Berlin", "Hi, I'm Lido.");
        Seedler seedler2 = new Seedler(2L, "Pruthvi Mathur Lakshmikanth", "Associate Developer", "Platform", "Puzzle", "Berlin", "Hi, I'm Pruthvi.");
        Seedler seedler3 = new Seedler(3L, "Vijay Kumar", "Associate Developer", "BMW", "Avengers", "Stuttgart", "Hi, I'm Vijay.");
        seedlers.add(seedler1);
        seedlers.add(seedler2);
        seedlers.add(seedler3);

        return seedlers;
    }
}
