package com.alelandaprojects.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
//    @GetMapping("/root")//lets the app know the method below is a GET endpoint
//	public String apiRoot(){
//		return "Hello, world!";
//	}
}
