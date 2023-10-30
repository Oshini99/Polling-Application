package com.example.pollsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		PollsAppApplication.class,
		Jsr310JpaConverters.class
})
public class PollsAppApplication {
	@PostConstruct
	void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}

	public static void main(String[] args) {
		SpringApplication.run(PollsAppApplication.class, args);
	}

}



//@SpringBootApplication
//public class PollsAppApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(PollsAppApplication.class, args);
//	}
//
//}
