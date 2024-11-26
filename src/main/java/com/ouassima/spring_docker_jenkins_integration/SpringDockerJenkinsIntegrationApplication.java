package com.ouassima.spring_docker_jenkins_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerJenkinsIntegrationApplication {
	@GetMapping("/hey")
	public String sayHey(){
		return "Hey welcome to my home ";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerJenkinsIntegrationApplication.class, args);
	}

}
