package com.config.security_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class SecurityConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityConfigurationApplication.class, args);
	}

	@GetMapping("/welcome")
	public @ResponseBody String welcome(){
		return "Welcome Page";
	}


}
