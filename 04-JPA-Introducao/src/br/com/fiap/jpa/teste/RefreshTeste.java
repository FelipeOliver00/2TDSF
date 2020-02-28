package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Departamento;

public class RefreshTeste {

	public static void main(String[] args) {
		//Criar a fabrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		//Pesquisar o departamento de código 1
		Departamento dep = em.find(Departamento.class, 1);
		//Exibir o nome do departamento
		System.out.println(dep.getNome());
		//Setar o nome do departamento (setNome())
		dep.setNome("RH");
		//Exibir o nome do departamento
		System.out.println(dep.getNome());
		//Fazer o refresh
		em.refresh(dep);
		//Exibir o nome do departamento
		System.out.println(dep.getNome());
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}