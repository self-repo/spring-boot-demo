package com.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen")

@RestController
public class HealthCheckApiController {

	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
	public String healthCheck() {
		return "200";
	}

}
