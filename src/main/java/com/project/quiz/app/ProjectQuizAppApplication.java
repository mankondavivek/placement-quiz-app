package com.project.quiz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.quiz.app")
public class ProjectQuizAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectQuizAppApplication.class, args);
	}
}