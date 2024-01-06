package com.twilioWhatapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.twilioWhatapp"})
public class TwilioWhatappMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwilioWhatappMessageApplication.class, args);
	}

}
