package coms.SpringBootAppForJenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAppForJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppForJenkinsApplication.class, args);
		System.out.println("This is Spring Boot App");
	}
}
