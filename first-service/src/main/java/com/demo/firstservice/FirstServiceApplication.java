package com.demo.firstservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FirstServiceApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(FirstServiceApplication.class, args);
	}

}
