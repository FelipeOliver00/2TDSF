package br.com.fiap.jpa.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Genero;
import br.com.fiap.jpa.entity.Login;
import br.com.fiap.jpa.entity.Post;
import br.com.fiap.jpa.entity.Usuario;

public class View {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();

		//Cria os objetos Login e Usuario relacionados
		Login login = new Login("username@admin.com", "123456");
		Usuario user = new Usuario("User Name", Genero.FEMININO, login);

		Post p1 = new Post("Aviso NAC", "NAC será aplicada logo mais");
		Post p2 = new Post("Grupos AM", "Informar o nome e integrantes do grupo");
		
		user.addPost(p1);
		user.addPost(p2);
		
		//Cadastra o login e o usuário
		//em.persist(login);
		em.persist(user);
		
		//Remove o usuário de código (1 PK)
		//Usuario busca = em.find(Usuario.class, 1);
		//em.remove(busca);
		
		//Efetiva no banco de dados
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Pesquisa o usuário de código 3
		//Usuario usuario = em.find(Usuario.class, 3);
		
		//System.out.println(usuario.getNome());
		//System.out.println(usuario.getLogin().getEmail());
		
		em.close();
		fabrica.close();
	}
	
}
