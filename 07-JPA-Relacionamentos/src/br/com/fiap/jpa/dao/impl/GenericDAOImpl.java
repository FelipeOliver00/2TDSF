package br.com.fiap.jpa.dao.impl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.GenericDAO;
import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;

/*
 * CRIAR O DAO GENÉRICO (interface e classe)
 * CRIAR O DAO PARA CADA ENTIDADE (utilizando o DAO genérico)
 * CRIAR O SINGLETON (EntityManagerFactorySingleton)
 */

public abstract class GenericDAOImpl<T,K> implements GenericDAO<T, K>{

	private EntityManager em;
	
	private Class<T> clazz;
	
	@SuppressWarnings("all")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		this.clazz = (Class<T>) ((ParameterizedType) 
				getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}
	
	@Override
	public void cadastrar(T entidade) {
		em.persist(entidade);
	}

	@Override
	public void atualizar(T entidade) {
		em.merge(entidade);
	}

	@Override
	public T pesquisar(K codigo) throws KeyNotFoundException {
		T entidade = em.find(clazz, codigo);
		if (entidade == null) {
			throw new KeyNotFoundException();
		}
		return entidade;
	}

	@Override
	public void remover(K codigo) throws KeyNotFoundException {
		em.remove(pesquisar(codigo));
	}

	@Override
	public void commit() throws CommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
			throw new CommitException();
		}
		
	}

}
