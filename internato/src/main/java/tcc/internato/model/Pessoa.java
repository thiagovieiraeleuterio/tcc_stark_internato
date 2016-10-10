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
//  @ File Name : Pessoa.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//



@Entity
public class Pessoa {
	@Column (nullable = false)
	@Id
	@GeneratedValue
	private Long id_pessoa;
	
	@Column (nullable = false)
	private String nome_pessoa;
	
	@Column (nullable = false)
	private int cpf_pessoa;
	
	@Column (nullable = false)
	public String matricula_pessoa;
	
	// getters e setters
	
	public Long getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Long id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public String getNome_pessoa() {
		return nome_pessoa;
	}

	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}

	public int getCpf_pessoa() {
		return cpf_pessoa;
	}

	public void setCpf_pessoa(int cpf_pessoa) {
		this.cpf_pessoa = cpf_pessoa;
	}

	public String getMatricula_pessoa() {
		return matricula_pessoa;
	}

	public void setMatricula_pessoa(String matricula_pessoa) {
		this.matricula_pessoa = matricula_pessoa;
	}

	public String getTelefone_pessoa() {
		return telefone_pessoa;
	}

	public void setTelefone_pessoa(String telefone_pessoa) {
		this.telefone_pessoa = telefone_pessoa;
	}

	public String getEmail_pessoa() {
		return email_pessoa;
	}

	public void setEmail_pessoa(String email_pessoa) {
		this.email_pessoa = email_pessoa;
	}

	@Column
	public String telefone_pessoa;
	
	@Column
	public String email_pessoa;
	
	
}
