package com.example.demo.controler;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Saludo;

@RestController
public class SaludoControlador {

	private static final String template = "Hola, %$";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/saludo")
	public Saludo saludo(@RequestParam(value="name", defaultValue="Mundo") String name) {
		return new Saludo(counter.incrementAndGet(), String.format(template, name));
	}
	
	
}
