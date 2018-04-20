package com.springboot.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class AppController {

	@Value("${msg}")
	private String msg = "default";

	@RequestMapping(value = "/show", method = { RequestMethod.GET, RequestMethod.POST })
	public String show() {
		return msg + UUID.randomUUID().toString();
	}

	@RequestMapping(value = "/sayHello", method = { RequestMethod.GET, RequestMethod.POST })
	public String sayHello(@RequestParam(value = "name", required = true) String name) {
		return "hello," + name;
	}

}
