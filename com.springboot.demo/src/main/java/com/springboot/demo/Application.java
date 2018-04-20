package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		// # http://localhost:8888/swagger-ui.html
		// # http://localhost:8888/
		SpringApplication.run(Application.class, args);
	}

}
