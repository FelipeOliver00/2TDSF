package br.com.fiap.orm;

import br.com.fiap.anotacao.Tabela;

public class Orm {

	public String gerarPesquisa(Object o) {
		//Recuperar a anotação @Tabela da classe
		Tabela anotacao = o.getClass().getAnnotation(Tabela.class);
		return "SELECT * FROM " + anotacao.nome();
	}
	
}