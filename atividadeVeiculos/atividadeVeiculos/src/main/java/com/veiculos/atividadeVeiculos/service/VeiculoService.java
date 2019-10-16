package com.veiculos.atividadeVeiculos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veiculos.atividadeVeiculos.model.beans.Veiculo;
import com.veiculos.atividadeVeiculos.repository.VeiculosRepository;
import com.veiculos.atividadeVeiculos.utils.Calculadora;

@Service
public class VeiculoService {
      @Autowired
      private VeiculosRepository veiculosRepo;
      
      @Autowired
      private Calculadora calculadora;
          
      public List<Veiculo> listarTodos() {
    	  List<Veiculo> veiculos = veiculosRepo.findAll();
    	  
    	  for(Veiculo v : veiculos) {
    		  v.setAutonomia(calculadora.calculaAutonomia(v.getTotTanque(), 
    				  v.getAtualTanque(), v.getKmRodados()));
    	  }
    	  
    	  return veiculos;
      }
}
