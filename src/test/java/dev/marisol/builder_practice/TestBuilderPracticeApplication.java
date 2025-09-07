package dev.marisol.builder_practice;

import org.springframework.boot.SpringApplication;

public class TestBuilderPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.from(BuilderPracticeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
