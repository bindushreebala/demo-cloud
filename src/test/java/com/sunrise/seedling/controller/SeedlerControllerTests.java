package com.sunrise.seedling.controller;

import com.sunrise.seedling.model.Group;
import com.sunrise.seedling.model.Role;
import com.sunrise.seedling.model.Seedler;
import com.sunrise.seedling.model.Team;
import com.sunrise.seedling.service.SeedlerService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;



@WebMvcTest(SeedlerController.class)
public class SeedlerControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    SeedlerService seedlerService;

    @Test
    public void testSeedlerController_getSeedlings() throws Exception {
        List<Seedler> seedlers = Collections.singletonList(new Seedler(1L, "Lido Mazzucco",
                Role.BACKEND_DEVELOPER,Group.PLATFORM, Team.PUZZLES, "Berlin", "Hi, I'm Lido."));
        //Seedler seedler1 = new Seedler(1L, "Lido Mazzucco", Role.BACKEND_DEVELOPER, Group.PLATFORM, Team.PUZZLES, "Berlin", "Hi, I'm Lido.");
        //seedlers.add(seedler1);
        Mockito.when(seedlerService.getSeedlings()).thenReturn(seedlers);
        mockMvc.perform(MockMvcRequestBuilders.get("/seedlings"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(1))
                .andExpect(jsonPath("$[0].name").value("Lido Mazzucco"));
    }
}
