package tcc.internato.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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

@Entity
@Table(name = "servidor")
@PrimaryKeyJoinColumn(name = "id_servidor")
public class Servidor extends Pessoa {

	// RELACIONAMENTOS ...

	// TODO
	// Um servidor esta associado a muitos atos indisciplinares.
	@OneToMany(cascade = CascadeType.REFRESH, targetEntity = AtoIndisciplinar.class, fetch = FetchType.LAZY, mappedBy = "servidores")
	private List<AtoIndisciplinar> atoindisciplinares;

	// um servidor está associada a 0 ou muitas vistorias.
	@OneToMany(cascade = CascadeType.REFRESH, targetEntity = Vistoria.class, fetch = FetchType.LAZY, mappedBy = "servidores")
	private List<Vistoria> vistorias;

	public List<AtoIndisciplinar> getAtoindisciplinares() {
		return atoindisciplinares;
	}

	public void setAtoindisciplinares(List<AtoIndisciplinar> atoindisciplinares) {
		this.atoindisciplinares = atoindisciplinares;
	}

	public List<Vistoria> getVistorias() {
		return vistorias;
	}

	public void setVistorias(List<Vistoria> vistorias) {
		this.vistorias = vistorias;
	}

}
