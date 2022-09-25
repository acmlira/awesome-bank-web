package acmlira.awesomebank.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AwesomeBankWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeBankWebApplication.class, args);
	}

}
