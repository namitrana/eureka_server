
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		System.out.println("This is Eureka Server...");
		//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 - namit232@gmail.com password
		//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 - namit_232@yahoo.com password 
		//test
	}

}
