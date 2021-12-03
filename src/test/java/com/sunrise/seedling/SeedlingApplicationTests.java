package com.sunrise.seedling;

import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.service.SeedlerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SeedlingApplicationTests {

    @Test
    void testDefaultSeedlers_SeedlerDetails()
    {
       List<Seedler> seedlers = SeedlerService.defaultSeedlers();

        Assertions.assertNotNull(seedlers);
        Assertions.assertTrue(seedlers.size() > 0);

    }

}
