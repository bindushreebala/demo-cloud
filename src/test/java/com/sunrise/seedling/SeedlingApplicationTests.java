package com.sunrise.seedling;

import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.service.SeedlerService;
import com.sunrise.seedling.service.SeedlerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SeedlingApplicationTests {

    @Test
    void testDefaultSeedlers_SeedlerDetails()
    {
        SeedlerServiceImpl seedlerService = new SeedlerServiceImpl();
        List<Seedler> seedlers = seedlerService.defaultSeedlers();

        Assertions.assertNotNull(seedlers);
        Assertions.assertTrue(seedlers.size() > 0);

    }

}
