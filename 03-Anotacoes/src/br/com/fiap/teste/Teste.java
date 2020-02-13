package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Produto;

public class Teste {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		//Recuperar os atributos da classe
		Field[] atributos = p.getClass().getDeclaredFields();
		//Exibir os atributos da classe
		for (Field f : atributos) {
			//Recuperar a anota��o @Coluna que est� no atributo
			Coluna anotacao = f.getAnnotation(Coluna.class);			
			System.out.println(f.getName() + " - " + anotacao.nome()
			 + " - Obrigat�rio: " + anotacao.obrigatorio());
		}
		
		//Recuperar os m�todos da classe produto
		Method[] metodos = p.getClass().getDeclaredMethods();
		//Exibir os m�todos da classe produto
		for (Method m : metodos) {
			System.out.println(m.getName());
		}
		
	}
	
}


