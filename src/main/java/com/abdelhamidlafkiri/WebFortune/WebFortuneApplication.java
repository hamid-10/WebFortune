package com.abdelhamidlafkiri.WebFortune;

import com.abdelhamidlafkiri.WebFortune.model.Epigram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFortuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFortuneApplication.class, args);
//		Populate the Epigram List with Data (quotes) once the backend is running
//		This will be done only once, after that the epigrams are stored in an array
		Epigram.populateEpigramList();

//		check backend running
		System.out.println("WebFortuneApplication Up and Running");
	}

}
