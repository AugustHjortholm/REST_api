package com.REST_api.REST_api;

import Board.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@SpringBootApplication
@RestController
public class RestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@GetMapping
	public List<Field> getBoard(String boardName){
		//Path filePath = Path.of("C:/Users/augus/Downloads/REST_api/REST_api/src/main/resources/testDir/"+boardName+".json");

		return List.of(new Field(1,1,"EAST","com.roborally.controller.GreenConveyorBelt"));

	}

}
