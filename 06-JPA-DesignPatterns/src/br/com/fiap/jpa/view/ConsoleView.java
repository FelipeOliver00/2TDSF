package br.com.fiap.jpa.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class ConsoleView {

	public static void main(String[] args) {
		//Obter uma instancia da fabrica
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fabrica.createEntityManager();
		
		
		//Fechar
		em.close();
		fabrica.close();
	}
	
}