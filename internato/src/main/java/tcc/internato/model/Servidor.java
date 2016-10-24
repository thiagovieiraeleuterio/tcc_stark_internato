package tcc.internato.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Servidor.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//

//@Entity
public class Servidor extends Pessoa {
	@Column(name = "id_servidor")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = AtoIndisciplinar.class, fetch = FetchType.LAZY, mappedBy = "servidor")
	private List<AtoIndisciplinar> atoindisciplinares;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<AtoIndisciplinar> getAtoindisciplinares() {
		return atoindisciplinares;
	}

	public void setAtoindisciplinares(List<AtoIndisciplinar> atoindisciplinares) {
		this.atoindisciplinares = atoindisciplinares;
	}

	// getter e setter

}
