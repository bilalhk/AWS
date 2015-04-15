package myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan({"blogs", "db", "myApp"})
public class Application {
	
	public static void main(String[] args) {		
		SpringApplication.run(Application.class, args);
	}
}
