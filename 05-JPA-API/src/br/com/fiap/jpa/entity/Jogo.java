package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_JOGO")
@SequenceGenerator(name="jogo", sequenceName = "SQ_TB_JOGO", allocationSize = 1)
public class Jogo {

	@Id
	@Column(name="cd_jogo")
	@GeneratedValue(generator = "jogo",strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_jogo", nullable = false, length = 20)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_categoria")
	private Categoria categoria;
	
	@Column(name="ds_faixa_etaria")
	private String faixaEtaria;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_lancamento")
	private Calendar dataLancamento;
	
	@Column(name="nr_jogadores")
	private int jogadores;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public int getJogadores() {
		return jogadores;
	}

	public void setJogadores(int jogadores) {
		this.jogadores = jogadores;
	}
	
}
