package com.veiculos.atividadeVeiculos.utils;

public class Calculadora {

	public double calculaAutonomia(double totTanque, double atualTanque, double kmRodados ){
		return kmRodados > 0 ? kmRodados/(totTanque - atualTanque) : 0; 
	}
	
}
