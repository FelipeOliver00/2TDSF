package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TB_DEPARTAMENTO")
@SequenceGenerator(name="dep", sequenceName = "SQ_TB_DEPARTAMENTO", allocationSize = 1)
public class Departamento {

	@Id
	@Column(name="cd_departamento")
	@GeneratedValue(generator = "dep", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_departamento", nullable = false, length = 40)
	private String nome;
	
	@Column(name="vl_faturamento", nullable = false)
	private double faturamento;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_abertura")
	private Calendar dataAbertura;
	
	@Lob
	@Column(name="fl_logo")
	private byte[] logo;
	
	@Enumerated(EnumType.STRING)
	@Column(name="nr_ramal")
	private Ramal ramal;
	
	@Transient
	private double faturamentoAnual;
	
	public Departamento() {
		super();
	}

	public Departamento(String nome, double faturamento, Calendar dataAbertura, byte[] logo, Ramal ramal) {
		super();
		this.nome = nome;
		this.faturamento = faturamento;
		this.dataAbertura = dataAbertura;
		this.logo = logo;
		this.ramal = ramal;
	}

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

	public double getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public Ramal getRamal() {
		return ramal;
	}

	public void setRamal(Ramal ramal) {
		this.ramal = ramal;
	}

	public double getFaturamentoAnual() {
		return faturamentoAnual;
	}

	public void setFaturamentoAnual(double faturamentoAnual) {
		this.faturamentoAnual = faturamentoAnual;
	}
	
	
}
