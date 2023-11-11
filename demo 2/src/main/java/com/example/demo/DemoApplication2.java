package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class DemoApplication2 {

	public static void main(String[] args) {

		ApplicationContext apc = SpringApplication.run(DemoApplication2.class, args);
		for(String s: apc.getBeanDefinitionNames()){
			System.out.println(s);
		}


	}
	@Bean

	public String getName() {
		 return "Hani";
	}
}
