package com.portfolio.diary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.portfolio.diary" })
public class DiaryApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiaryApplication.class, args);
	}

}
