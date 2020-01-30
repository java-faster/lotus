package com.coder520.mamabuyschedulerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MamabuySchedulerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MamabuySchedulerServiceApplication.class, args);
	}

}
