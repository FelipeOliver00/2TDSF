package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Animal;

public interface AnimalDao {

	//Definir as assinaturas dos m�todos
	void cadastrar(Animal animal);
	
	void deletar(String especie);
	
}