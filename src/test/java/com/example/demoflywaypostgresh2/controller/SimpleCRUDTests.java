package com.example.demoflywaypostgresh2.controller;

import com.example.demoflywaypostgresh2.controller.rest.SimpleCRUD;
import com.example.demoflywaypostgresh2.service.ProductService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@RunWith(SpringRunner.class)
@WebMvcTest(SimpleCRUD.class)
@ActiveProfiles("integrationtest")
public class SimpleCRUDTests {

    @Autowired
    private MockMvc mockMvc;

    @BeforeAll
    public void init() {
        mockMvc = MockMvcBuilders
                .standaloneSetup(new SimpleCRUD())
                .build();
    }
    @Test
    public void contextLoads() {
        System.out.println("Hello Context");
//		System.out.println(environment.getProperty("my.custom.property")); // inlined
//        System.out.println(environment.getProperty("spring.application.name")); // integ
    }

    @Test
    public void givenProductId_WhenGetProduct_thenStatus200() throws Exception {
        mockMvc.perform(get("/simple/tutorial/1"))
//                .andDo(print())
                .andExpect(status().isOk());
//				.andExpect(MockMvcResultMatchers.content().json(jsonResponse.toJson()));
    }

}
