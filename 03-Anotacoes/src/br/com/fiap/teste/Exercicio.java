package br.com.fiap.teste;

import br.com.fiap.bean.Aluno;
import br.com.fiap.bean.Produto;
import br.com.fiap.orm.Orm;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar um produto e um aluno
		Produto prod = new Produto();
		Aluno aluno = new Aluno();
		
		//Instanciar um Orm
		Orm orm = new Orm();
		
		//Chamar o método de gerar SQL
		System.out.println(orm.gerarPesquisa(aluno));
		System.out.println(orm.gerarPesquisa(prod));
		
		
	}
	
}




