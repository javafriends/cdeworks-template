package br.com.javafriends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MainApplicationBoot {

	public static void main(String[] args) {
		SpringApplication.run(MainApplicationBoot.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
}
