package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.KeyNotFoundException;



public interface GenericDAO<T,K> {

	void cadastrar(T entidade);
	
	void atualizar(T entidade);
	
	T pesquisar(K codigo) throws KeyNotFoundException;
	
	void remover(K codigo) throws KeyNotFoundException;
	
	void commit() throws CommitException;
	
}