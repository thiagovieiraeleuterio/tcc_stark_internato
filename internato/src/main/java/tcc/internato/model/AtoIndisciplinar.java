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
//  @ File Name : Ato_Indisciplinar.java
//  @ Date : 04/10/2016
//  @ Author : 
//
// 

@Entity
@Table(name = "ato_indisciplinar")
public class AtoIndisciplinar extends EntidadeBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descricao_ato", nullable = false)
	private String descricao;

	@Column(name = "data_ato", nullable = false)
	private Date data;

	// // RELACIONAMENTOS
	//
	// // muitos atos indisciplinares estam associados a um servidor
	// @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	// @PrimaryKeyJoinColumn
	// @JoinColumn(name = "servidor_fk")
	// private Servidor servidor;
	//
	// // Muitos atos indisciplinares estam associados a um interno.
	// @ManyToOne
	// @JoinColumn(name = "interno_id")
	// private Interno internos;
	//
	// // Um ato indisciplinar provem de uma vistoria.
	// @OneToOne(optional = false, fetch = FetchType.EAGER, cascade = {
	// CascadeType.REFRESH })
	// @JoinColumn(name = "vistoria_fk", nullable = false, unique = true)
	// private Vistoria vistoria;
	//
	// // Vários atos indisciplinares provem de uma chamada.
	// @ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.REFRESH })
	// @PrimaryKeyJoinColumn
	// @JoinColumn(name = "chamada_fk")
	// private Chamada chamada;
	//
	// // um regulamento esta associados a 0 ou muitos atos indisciplinares
	// @ManyToMany(cascade = CascadeType.ALL)
	// @JoinTable(name = "regulamento_ato", joinColumns = @JoinColumn(name =
	// "fk_regulamento") , inverseJoinColumns = @JoinColumn(name = "id_ato") )
	// private Set<Regulamento> regulamento;
	//
	// public Long getId() {
	// return id;
	// }
	//
	// public void setId(Long id) {
	// this.id = id;
	// }
	//
	// public String getDescricao() {
	// return descricao;
	// }
	//
	// public void setDescricao(String descricao) {
	// this.descricao = descricao;
	// }
	//
	// public Date getData() {
	// return data;
	// }
	//
	// public void setData(Date data) {
	// this.data = data;
	// }
	//
	// public Servidor getServidor() {
	// return servidor;
	// }
	//
	// public void setServidor(Servidor servidor) {
	// this.servidor = servidor;
	// }
	//
	// public Interno getInternos() {
	// return internos;
	// }
	//
	// public void setInternos(Interno internos) {
	// this.internos = internos;
	// }
	//
	// public Vistoria getVistoria() {
	// return vistoria;
	// }
	//
	// public void setVistoria(Vistoria vistoria) {
	// this.vistoria = vistoria;
	// }
	//
	// public Chamada getChamada() {
	// return chamada;
	// }
	//
	// public void setChamada(Chamada chamada) {
	// this.chamada = chamada;
	// }
	//
	// public Set<Regulamento> getRegulamento() {
	// return regulamento;
	// }
	//
	// public void setRegulamento(Set<Regulamento> regulamento) {
	// this.regulamento = regulamento;
	// }

}
