package com.mobe.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TuttiFruttiZeebeWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TuttiFruttiZeebeWorkerApplication.class, args);
	}

}
