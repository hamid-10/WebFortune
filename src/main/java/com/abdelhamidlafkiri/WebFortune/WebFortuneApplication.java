package com.abdelhamidlafkiri.WebFortune;

import com.abdelhamidlafkiri.WebFortune.model.Epigram;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebFortuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFortuneApplication.class, args);
		Epigram.populateEpigramList();
		System.out.println("WebFortuneApplication.main");
	}

}
