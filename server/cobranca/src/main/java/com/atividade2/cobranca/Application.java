package com.atividade2.cobranca;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		
		// Update the default port 
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}

}
