package com.sunrise.seedling.service;

import com.sunrise.seedling.model.Group;
import com.sunrise.seedling.model.Role;
import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.model.Team;

import java.util.ArrayList;
import java.util.List;

public interface SeedlerService {

    void addDefaultSeedlers();
    List<Seedler> getSeedlings();

}
