package br.com.fiap.jpa.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Departamento;
import br.com.fiap.jpa.entity.Ramal;

public class CadastroTeste {

	public static void main(String[] args) {
		//Criar uma fabrica de entity manager
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("oracle");	
		
		//Criar um entity manager
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um departamento
		Departamento dep = new Departamento("RH", 0, Calendar.getInstance(),
				null, Ramal._345);
		
		//Cadatrar no banco de dados
		em.persist(dep);
		
		//Abrir uma transação e finalizar com um commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		//fechar as paradas
		em.close();
		fabrica.close();
	}
	
}