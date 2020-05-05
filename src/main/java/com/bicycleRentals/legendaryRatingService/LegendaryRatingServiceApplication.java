package com.bicycleRentals.legendaryRatingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LegendaryRatingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegendaryRatingServiceApplication.class, args);
	}
}
