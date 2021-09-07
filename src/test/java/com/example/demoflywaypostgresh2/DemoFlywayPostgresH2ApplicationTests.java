package com.example.demoflywaypostgresh2;

import com.example.demoflywaypostgresh2.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(
		locations = "classpath:application-integrationtest.yml")
@ActiveProfiles("integrationtest")
class DemoFlywayPostgresH2ApplicationTests {

	@Autowired
	private Environment environment;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ProductService productService;

	@Test
	void contextLoads() {
//		System.out.println(environment.getProperty("my.custom.property")); // inlined
		System.out.println(environment.getProperty("spring.application.name")); // integ
	}

	@Test
	void givenProductId_WhenGetProduct_thenStatus200() throws Exception {
		mockMvc.perform(get("/inventory/products/1"))
//                .andDo(print())
				.andExpect(status().isOk());
//				.andExpect(MockMvcResultMatchers.content().json(jsonResponse.toJson()));
	}



}
