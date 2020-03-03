package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.entity.Jogo;
import br.com.fiap.jpa.exception.ErroCommitException;
import br.com.fiap.jpa.exception.JogoNaoEncontradoException;

public interface JogoDAO {

	void create(Jogo jogo);
	
	void update(Jogo jogo);
	
	Jogo read(int codigo);
	
	void delete(int codigo) throws JogoNaoEncontradoException;
	
	void commit() throws ErroCommitException;
	
}