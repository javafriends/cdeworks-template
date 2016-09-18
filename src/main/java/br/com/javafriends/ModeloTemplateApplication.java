package br.com.javafriends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class ModeloTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModeloTemplateApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
