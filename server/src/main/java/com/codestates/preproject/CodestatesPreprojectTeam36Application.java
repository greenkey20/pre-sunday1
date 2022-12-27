package com.codestates.preproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CodestatesPreprojectTeam36Application {

	public static void main(String[] args) {
		SpringApplication.run(CodestatesPreprojectTeam36Application.class, args);
	}

}
