package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.JogoDAO;
import br.com.fiap.jpa.entity.Jogo;
import br.com.fiap.jpa.exception.ErroCommitException;
import br.com.fiap.jpa.exception.JogoNaoEncontradoException;

public class JogoDAOImpl implements JogoDAO {

	private EntityManager em;
	
	//Construtor recebe o entity manager
	public JogoDAOImpl(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public void create(Jogo jogo) {
		em.persist(jogo);
	}

	@Override
	public void update(Jogo jogo) {
		em.merge(jogo);
	}

	@Override
	public Jogo read(int codigo) {
		return em.find(Jogo.class, codigo);
	}

	@Override
	public void delete(int codigo) throws JogoNaoEncontradoException {
		Jogo jogo = read(codigo);
		//Validar se o jogo existe no banco
		if (jogo == null) {
			throw new JogoNaoEncontradoException();
		}
		em.remove(jogo);
	}

	@Override
	public void commit() throws ErroCommitException {
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
			throw new ErroCommitException();
		}
	}

}










