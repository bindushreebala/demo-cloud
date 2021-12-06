package com.sunrise.seedling.service;

import com.sunrise.seedling.dao.SeedlerRepository;
import com.sunrise.seedling.model.Group;
import com.sunrise.seedling.model.Role;
import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.map.repository.config.EnableMapRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class SeedlerServiceImpl implements SeedlerService {

    @Autowired
    private SeedlerRepository repository;


    public List<Seedler> defaultSeedlers() {
        List<Seedler> seedlers = new ArrayList<>();
        Seedler seedler1 = new Seedler(1L, "Lido Mazzucco", Role.BACKEND_DEVELOPER, Group.PLATFORM, Team.PUZZLES, "Berlin", "Hi, I'm Lido.");
        Seedler seedler2 = new Seedler(2L, "Pruthvi Mathur Lakshmikanth", Role.BACKEND_DEVELOPER, Group.PLATFORM, Team.PUZZLES, "Berlin", "Hi, I'm Pruthvi.");
        Seedler seedler3 = new Seedler(3L, "Vijay Kumar", Role.BACKEND_DEVELOPER, Group.BMW, Team.THE_AVENGERS, "Stuttgart", "Hi, I'm Vijay.");
        seedlers.add(seedler1);
        seedlers.add(seedler2);
        seedlers.add(seedler3);
        return seedlers;
    }

    @PostConstruct
    @Override
    public void addDefaultSeedlers(){
    }

    @Override
    public List<Seedler> getSeedlings() {
        return repository.getAllSeedlers();
    }

}
