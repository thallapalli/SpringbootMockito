package com.kt.spring.mockito.SpringbootMockito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootMockitoController {
	@GetMapping(value = "/hello")
	public  String hello() {
		return "Hello , I am SpringbootMockito Service";
	}

}
