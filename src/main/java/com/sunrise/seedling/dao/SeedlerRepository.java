package com.sunrise.seedling.dao;

import com.sunrise.seedling.model.Seedler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SeedlerRepository {

    List<Seedler> getAllSeedlers();
}
