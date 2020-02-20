package com.example.demo.controller;

import com.example.demo.togglz.Features;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting() {
	    String message = "";

	    if (Features.GREETING_NEW.isActive()) {
            message = message + "- Olá Novo código <br/>";
	    }

        if (Features.GREETING_OLD.isActive()) {
            message = message + "- Olá Velho código <br/>";
        }

        if (message == "") {
            message = "Desativado!";
        }

		return message;
	}
}