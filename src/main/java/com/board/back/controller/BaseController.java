package com.board.back.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BaseController {
	
	@GetMapping("/")
	public String home() {
		return "hello world spring boot~";
	}
}
