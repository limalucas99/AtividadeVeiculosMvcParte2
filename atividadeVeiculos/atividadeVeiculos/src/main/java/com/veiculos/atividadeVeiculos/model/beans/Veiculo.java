package com.veiculos.atividadeVeiculos.model.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veiculo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String modelo;
	
	private String marca;
	
	private String anoFab;
	
	private String cor;
	
	private Double totTanque;
	
	private Double atualTanque;
	
	private Double kmRodados;
	
	private Double autonomia;
	
	

	public Double getTotTanque() {
		return totTanque;
	}

	public void setTotTanque(Double totTanque) {
		this.totTanque = totTanque;
	}

	public Double getAtualTanque() {
		return atualTanque;
	}

	public void setAtualTanque(Double atualTanque) {
		this.atualTanque = atualTanque;
	}

	public Double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(Double kmRodados) {
		this.kmRodados = kmRodados;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public Double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}
	
	
	
}
