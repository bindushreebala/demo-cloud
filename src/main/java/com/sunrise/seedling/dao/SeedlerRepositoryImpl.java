package com.sunrise.seedling.dao;

import com.sunrise.seedling.model.Group;
import com.sunrise.seedling.model.Role;
import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class SeedlerRepositoryImpl extends JdbcDaoSupport implements SeedlerRepository {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<Seedler> getAllSeedlers() {
        String sql = "select * from seedler_info";
        List<Map<String, Object>> result = getJdbcTemplate().queryForList(sql);
        List<Seedler> seedlers = new ArrayList<>();
        for (Map<String, Object> row : result) {
            Seedler seedler = new Seedler((Long) row.get("id"), (String) row.get("name"), (Role) row.get("role"),
                    (Group) row.get("seedler_group"), (Team) row.get("team"), (String) row.get("location"), (String) row.get("bio"));
            seedlers.add(seedler);
        }
        return seedlers;

    }
}
