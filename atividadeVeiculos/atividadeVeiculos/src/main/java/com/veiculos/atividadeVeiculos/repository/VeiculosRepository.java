package com.veiculos.atividadeVeiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veiculos.atividadeVeiculos.model.beans.Veiculo;

public interface VeiculosRepository extends JpaRepository<Veiculo, Long>{

}
