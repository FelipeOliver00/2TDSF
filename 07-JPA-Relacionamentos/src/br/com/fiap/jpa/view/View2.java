package br.com.fiap.jpa.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.UsuarioDAO;
import br.com.fiap.jpa.dao.impl.UsuarioDAOImpl;
import br.com.fiap.jpa.entity.Genero;
import br.com.fiap.jpa.entity.Login;
import br.com.fiap.jpa.entity.Patrocinio;
import br.com.fiap.jpa.entity.Post;
import br.com.fiap.jpa.entity.Usuario;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class View2 {

	//Cadastrar todas as entidades relacionadas
	public static void main(String[] args) {
		
		//Instanciar o EntityManagerFactory e EntityManager
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar o UsuarioDAOImpl
		UsuarioDAO dao = new UsuarioDAOImpl(em);
		
		//Instanciar um login
		Login login = new Login("admin@admin.com","123");
		
		//Instanciar um usuario com o login
		Usuario usuario = new Usuario("Thiago", Genero.MASCULINO, login);
		
		//Instanciar 3 post e adicionar no usuario
		usuario.addPost(new Post("AM", "Parceria com a IBM"));
		usuario.addPost(new Post("NAC", "Será lançada hoje a tarde"));
		usuario.addPost(new Post("Grupos de AM", "Me mandem os grupos!"));
		
		//Instanciar uma lista de patrocinios e adicionar 2 patrocinios na lista
		List<Patrocinio> lista = new ArrayList<Patrocinio>();
		lista.add(new Patrocinio(100, Calendar.getInstance(), "FIAP"));
		lista.add(new Patrocinio(200, Calendar.getInstance(), "IBM"));
		
		//Setar a lista de patrocinio no post
		//Recupera o primeiro item da lista de post do usuário para setar a lista de patrocinio
		usuario.getPosts().get(0).setPatrocinios(lista);
		
		//Cadastrar o usuario
		dao.cadastrar(usuario);
		
		//Commit
		try {
			dao.commit();
			System.out.println("Sucesso!");
		} catch (CommitException e) {
			System.out.println("Erro..");
		}
		
		em.close();
		fabrica.close();
	}
	
}