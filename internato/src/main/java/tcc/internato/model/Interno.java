package tcc.internato.model;

import java.util.Date;

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
//  @ File Name : Interno.java
//  @ Date : 04/10/2016
//  @ Author : 
//
//



@Entity
public class Interno extends Pessoa {
	@Column(name = "id_interno")
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (nullable = false)
	public String curso;
	
	@Column (name = "idade_interno", nullable = false)
	public int idade;
	
	@Column (name = "dt_nasc_interno")
	public Date dt_nasc;
	//TODO DATA TIPO CALENDAR?
	
	@Column
	public int conta_banco;
	
	@Column
	public int agencia_banco;
	
	@Column
	public Object foto_interno;
	
	@Column
	public String dia_limpeza;
	
	@Column (nullable = false)
	public String motivo;
	
	
	// getters e setters
	
	public Long getId_interno() {
		return id;
	}

	public void setId_interno(Long id_interno) {
		this.id = id_interno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getIdade_interno() {
		return idade;
	}

	public void setIdade_interno(int idade_interno) {
		this.idade = idade_interno;
	}

	public int getConta_banco() {
		return conta_banco;
	}

	public void setConta_banco(int conta_banco) {
		this.conta_banco = conta_banco;
	}

	public int getAgencia_banco() {
		return agencia_banco;
	}

	public void setAgencia_banco(int agencia_banco) {
		this.agencia_banco = agencia_banco;
	}

	public Object getFoto_interno() {
		return foto_interno;
	}

	public void setFoto_interno(Object foto_interno) {
		this.foto_interno = foto_interno;
	}

	public String getDia_limpeza() {
		return dia_limpeza;
	}

	public void setDia_limpeza(String dia_limpeza) {
		this.dia_limpeza = dia_limpeza;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getProblema_saude() {
		return problema_saude;
	}

	public void setProblema_saude(String problema_saude) {
		this.problema_saude = problema_saude;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Date getData_saida() {
		return data_saida;
	}

	public void setData_saida(Date data_saida) {
		this.data_saida = data_saida;
	}

	public Date getData_desistencia() {
		return data_desistencia;
	}

	public void setData_desistencia(Date data_desistencia) {
		this.data_desistencia = data_desistencia;
	}

	@Column
	public String problema_saude;
	
	@Column
	public boolean ativo;
	
	@Column
	public Date data_saida;
	
	@Column
	public Date data_desistencia;
}
