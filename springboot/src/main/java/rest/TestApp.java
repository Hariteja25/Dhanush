package rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "rest" })
public class TestApp {
	public static void main(String[] args) {
		SpringApplication.run(TestApp.class, args);
	}
}
