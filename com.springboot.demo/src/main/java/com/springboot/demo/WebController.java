package com.springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@Value("${booName}")
	private String booName;

	@Value("${bookTitle}")
	private String bookTitle;

	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("booName", booName);
		map.addAttribute("bookTitle", bookTitle);
		return "welcome";
	}

}
