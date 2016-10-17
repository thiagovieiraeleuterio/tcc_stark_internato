package tcc.internato.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Chamada.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//



@Entity
@Table(name="chamada")
public class Chamada {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_chamada")
	public int id;
	
	@Column(name ="data_chamada", nullable = false)
	public Date data;
	
	@Column(nullable = false)
	public boolean falta;
	
	@Column(nullable = true)
	public String justificativa;

	// getters e setters
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData_chamada() {
		return data;
	}

	public void setData_chamada(Date data_chamada) {
		this.data = data_chamada;
	}

	public boolean isFalta() {
		return falta;
	}

	public void setFalta(boolean falta) {
		this.falta = falta;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}
}
