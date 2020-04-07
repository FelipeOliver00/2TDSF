package br.com.fiap.jpa.dao.impl;

import br.com.fiap.jpa.entity.Usuario;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.UsuarioDAO;

public class UsuarioDAOImpl extends GenericDAOImpl<Usuario, Integer> implements UsuarioDAO{

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}

}
