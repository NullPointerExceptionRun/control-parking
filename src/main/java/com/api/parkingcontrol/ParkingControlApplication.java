package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  //classe para inicialização da aplicação
@RestController // Gerar dependencias do bean do tipo controller
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	
	@GetMapping("/")
	public String index() {
		return "ola mundo";
	}
	
	
}
