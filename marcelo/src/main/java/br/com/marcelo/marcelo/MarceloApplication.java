package br.com.marcelo.marcelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.marcelo")
public class MarceloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarceloApplication.class, args);
	}

}
