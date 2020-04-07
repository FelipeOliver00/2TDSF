package br.com.fiap.jpa.dao.impl;

import br.com.fiap.jpa.entity.Post;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.PostDAO;

public class PostDAOImpl extends GenericDAOImpl<Post, Integer> implements PostDAO{

	public PostDAOImpl(EntityManager em) {
		super(em);
	}

}
