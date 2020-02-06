package br.com.fiap.revisao.dao;

import br.com.fiap.revisao.bean.Animal;

public interface AnimalDao {

	//Definir as assinaturas dos métodos
	void cadastrar(Animal animal);
	
	void deletar(String especie);
	
}