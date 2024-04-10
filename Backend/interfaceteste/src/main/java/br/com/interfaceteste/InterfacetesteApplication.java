package br.com.interfaceteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/hello")
public class InterfacetesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterfacetesteApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Hello, Wordddd!");
	}

}
