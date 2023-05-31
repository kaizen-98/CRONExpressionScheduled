package com.example.CRONExpressionScheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CronExpressionScheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronExpressionScheduledApplication.class, args);
	}

}
