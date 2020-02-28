package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Departamento;

public class RemoveTeste {

	public static void main(String[] args) {
		//Criar a fabrica
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();
		//Pesquisar o departamento
		Departamento dep = em.find(Departamento.class, 2);
		//Remover
		em.remove(dep);
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}





