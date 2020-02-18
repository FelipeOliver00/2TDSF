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
@Table(name = "TB_FUNCIONARIO")
@SequenceGenerator(name="func",sequenceName = "SQ_TB_FUNCIONARIO",allocationSize = 1)
public class Funcionario {

	@Id
	@Column(name="cd_funcionario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "func")
	private int codigo;

	@Column(name="nm_funcionario", nullable = false, length = 50)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_admissao", nullable = false)
	private Calendar dataAdmissao;
	
	@Temporal(TemporalType.DATE) //armazena somente a data no banco
	@Column(name="dt_desligamento")
	private Calendar dataDesligamento;
	
	@Column(name="vl_salario", nullable = false)
	private double salario;
	
	//não será uma coluna no banco de dados
	@Transient
	private double salarioAnual;
	
	@Lob
	@Column(name="ds_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING) //grava a string e não a posição
	@Column(name="ds_cargo", nullable = false)
	private Cargo cargo;

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

	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Calendar getDataDesligamento() {
		return dataDesligamento;
	}

	public void setDataDesligamento(Calendar dataDesligamento) {
		this.dataDesligamento = dataDesligamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalarioAnual() {
		return salarioAnual;
	}

	public void setSalarioAnual(double salarioAnual) {
		this.salarioAnual = salarioAnual;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
}














