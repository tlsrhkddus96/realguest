package org.zerock.realguest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RealguestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealguestApplication.class, args);
	}

}
