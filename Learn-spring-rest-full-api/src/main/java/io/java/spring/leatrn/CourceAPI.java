package io.java.spring.leatrn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages="io.java.spring")
public class CourceAPI extends SpringBootServletInitializer{
	

	public static void main(String[] args) {
		
		SpringApplication.run(CourceAPI.class, args);

	}

}
