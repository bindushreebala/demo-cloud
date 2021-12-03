package com.sunrise.seedling.dao;

import com.sunrise.seedling.model.Seedler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedlerRepository extends CrudRepository<Seedler, Long> {


}
