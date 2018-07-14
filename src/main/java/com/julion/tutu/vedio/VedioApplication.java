package com.julion.tutu.vedio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VedioApplication {

	@GetMapping("/test")
	public String test() {
		return "Test!";
	}

	public static void main(String[] args) {
		SpringApplication.run(VedioApplication.class, args);
	}
}
