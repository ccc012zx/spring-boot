package com.zml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.zml"})
public class DemoRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestfulApiApplication.class, args);
	}

}
