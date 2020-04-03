package br.com.fiap.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TB_LOGIN")
@SequenceGenerator(name="login", sequenceName = "SQ_TB_LOGIN", allocationSize = 1)
public class Login {

	@Id
	@Column(name="cd_login")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "login")
	private int codigo;
	
	@Column(name="ds_email", nullable = false, length = 100)
	private String email;
	
	@Column(name="ds_senha", length = 50, nullable = false)
	private String senha;
	
	//Mapeamento bidirecional um-para-um
	//Sempre que for bidirecional precisamos utilizar o mappedBy (quem não tem a FK)
	//mappedBy -> nome atributo que mapeia a relação no banco de dados (Na classe Usuario)
	@OneToOne(mappedBy = "login", cascade = CascadeType.PERSIST)
	private Usuario usuario;

	public Login(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public Login() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
