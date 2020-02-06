package br.com.fiap.revisao.teste;

import br.com.fiap.revisao.bean.Sexo;
import br.com.fiap.revisao.bean.Tigre;

public class TesteEnum {

	public static void main(String[] args) {
		//Instanciar um tigre
		Tigre t = new Tigre("Negro");
		//Colocar um valor para o sexo do tigre
		t.setSexo(Sexo.FEMEA);
		
		//Validar se o tigre é femea
		if (t.getSexo() == Sexo.FEMEA) {
			System.out.println("É uma tigre");
		}
		
	}
	
}
