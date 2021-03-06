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
		
		//Pesquisar um departamento (Classe,chave prim�ria)
		Departamento dep = em.find(Departamento.class, 3);
		
		System.out.println(dep.getNome());
		System.out.println(dep.getFaturamentoAnual());
		
		//Alterar o valor do faturamento
		dep.setFaturamento(50000);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//fechar as paradas
		em.close();
		fabrica.close();
	}
	
}




