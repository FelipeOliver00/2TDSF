package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_USUARIO")
@SequenceGenerator(name="usuario", sequenceName = "SQ_TB_USUARIO", allocationSize = 1)
public class Usuario {

	@Id
	@Column(name="cd_usuario")
	@GeneratedValue(generator = "usuario", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_usuario", nullable = false, length = 80)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", nullable = false)
	private Genero genero;
	
	//Mapeando o relacioamento com o login
	@OneToOne
	@JoinColumn(name = "cd_login", nullable = false)
	private Login login;

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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
}
