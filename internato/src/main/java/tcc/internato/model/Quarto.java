package tcc.internato.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Quarto.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//

@Entity
public class Quarto {
	@Column (name = "id_quarto")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	//getter e setter
	
	public Long getId_quarto() {
		return id;
	}

	public void setId_quarto(Long id_quarto) {
		this.id = id_quarto;
	}
	
}
