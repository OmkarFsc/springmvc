package com.courseapi.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello ") // here hello is url
	public String saiHi()
	{
		return "Hi";
	}
}
