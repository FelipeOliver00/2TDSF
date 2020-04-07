package br.com.fiap.jpa.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

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
	
	//Mapear o relacionamento birecional (um-para-muitos)
	//mappedBy -> "usuario" nome do atributo na classe Post que mapeia a FK
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.PERSIST)
	private List<Post> posts = new ArrayList<Post>();
	
	//Mapeando o relacionamento com o login
	//cascade -> realiza as ações configuradas na relação
	//fetch -> determina o momento que será carregada a relação
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "cd_login")
	private Login login;
	
	//Método para adicionar post no usuário
	//Método utilizado somente na relação OneToMany
	public void addPost(Post post) {
		post.setUsuario(this);
		//adiciona o post na lista
		posts.add(post);
	}
	
	public Usuario(String nome, Genero genero, Login login) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.login = login;
	}

	public Usuario() {
		super();
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

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
}
