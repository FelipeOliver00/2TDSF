package br.com.fiap.jpa.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Departamento;
import br.com.fiap.jpa.entity.Ramal;

public class AtualizaTeste {

	public static void main(String[] args) {
		//Criar a fabrica de Entity Manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um departamento com um código do db
		Departamento dep = new Departamento("Financeiro", 
				5000, Calendar.getInstance(), null, Ramal.FINANCEIRO_549);
		dep.setCodigo(2); //setar um código existente no banco
		
		Departamento departamento = em.merge(dep);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		//Fechar as paradas
		em.close();
		fabrica.close();
	}
	
}