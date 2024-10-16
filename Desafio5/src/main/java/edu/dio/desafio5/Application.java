package edu.dio.desafio5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 
 * @author Guilherme
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
	}

}


//http://localhost:8080/swagger-ui/index.html