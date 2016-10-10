package tcc.internato.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Endereco.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//



@Entity
public class Endereco {
	@Id
	@GeneratedValue
	private Long id_endereco;
	
	@Column(nullable = false)
	public String cidade_interno;
	
	@Column(nullable = false)
	public String estado_interno;
	
	@Column(nullable = false)
	public int cep_interno;
	
	@Column(nullable = false)
	public String endereco_interno;
	
	@Column(nullable = false)
	public String avenida_interno;
	
	@Column
	public String apt_interno;
	
	@Column
	public int numero_casa_interno;
	
	@Column(nullable = false)
	public String reside_com;

	// getters e setters
	
	
	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getCidade_interno() {
		return cidade_interno;
	}

	public void setCidade_interno(String cidade_interno) {
		this.cidade_interno = cidade_interno;
	}

	public String getEstado_interno() {
		return estado_interno;
	}

	public void setEstado_interno(String estado_interno) {
		this.estado_interno = estado_interno;
	}

	public int getCep_interno() {
		return cep_interno;
	}

	public void setCep_interno(int cep_interno) {
		this.cep_interno = cep_interno;
	}

	public String getEndereco_interno() {
		return endereco_interno;
	}

	public void setEndereco_interno(String endereco_interno) {
		this.endereco_interno = endereco_interno;
	}

	public String getAvenida_interno() {
		return avenida_interno;
	}

	public void setAvenida_interno(String avenida_interno) {
		this.avenida_interno = avenida_interno;
	}

	public String getApt_interno() {
		return apt_interno;
	}

	public void setApt_interno(String apt_interno) {
		this.apt_interno = apt_interno;
	}

	public int getNumero_casa_interno() {
		return numero_casa_interno;
	}

	public void setNumero_casa_interno(int numero_casa_interno) {
		this.numero_casa_interno = numero_casa_interno;
	}

	public String getReside_com() {
		return reside_com;
	}

	public void setReside_com(String reside_com) {
		this.reside_com = reside_com;
	}
	
}
