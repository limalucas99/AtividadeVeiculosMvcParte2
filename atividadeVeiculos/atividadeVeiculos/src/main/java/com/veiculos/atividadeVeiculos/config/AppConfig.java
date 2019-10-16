package com.veiculos.atividadeVeiculos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.veiculos.atividadeVeiculos.utils.Calculadora;

@Configuration
public class AppConfig {

	@Bean
	public Calculadora GetCalculadora() {
		return new Calculadora();
	}
	
}
