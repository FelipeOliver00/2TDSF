package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Departamento;

public class PesquisaTeste {

	public static void main(String[] args) {
		//Criar a fabrica de entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar um departamento (Classe,chave primária)
		Departamento dep = em.find(Departamento.class, 2);
		
		System.out.println(dep.getNome());
		
		//fechar as paradas
		em.close();
		fabrica.close();
	}
	
}




