package com.sunrise.seedling.service;

import com.sunrise.seedling.dao.SeedlerRepository;
import com.sunrise.seedling.model.Seedler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.map.repository.config.EnableMapRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@EnableMapRepositories
public class SeedlerServiceImpl implements SeedlerService {

    private SeedlerRepository repository;

//    public SeedlerServiceImpl(SeedlerRepository repository) {
//        this.repository = repository;
//        this.repository.saveAll(SeedlerService.defaultSeedlers());
//    }

    public SeedlerServiceImpl() {
        this.repository.saveAll(SeedlerService.defaultSeedlers());
    };

    @Override
    public List<Seedler> getSeedlings() {
        return (List<Seedler>)this.repository.findAll();
    }

}
