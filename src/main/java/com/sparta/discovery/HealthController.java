package com.sparta.discovery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {

	@GetMapping("/health/test")
	public Map<String, String> test() {
		return Map.of(
				"service", "discovery-service",
				"status", "UP"
		);
	}

}
