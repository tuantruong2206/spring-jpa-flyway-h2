package com.example.demoflywaypostgresh2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {/*"com.nab.icommerce.base.*", */"com.example.demoflywaypostgresh2.*"})
public class DemoFlywayPostgresH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoFlywayPostgresH2Application.class, args);
	}

}
