package br.com.fiap.revisao.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.revisao.bean.Animal;
import br.com.fiap.revisao.bean.Tigre;

public class TesteColecao {

	public static void main(String[] args) {
		//Criar uma lista de Animal
		List<Animal> animais = new ArrayList<Animal>();
		//Adicionar tigres na lista		
		animais.add(new Tigre("Bengala"));
		animais.add(new Tigre("Branco"));
		
		//Exibir os animais da lista
		for (Animal a : animais) {
			System.out.println(a.getEspecie());
		}
		
		//Criar um mapa <Chave,Valor>
		Map<String, Animal> mapa = new HashMap<String, Animal>();
		//Adicionar valores no mapa
		mapa.put("zezinho", new Tigre("Bengala"));
		mapa.put("luizinho", new Tigre("Branco"));
		
		//Recuperar o animal do mapa
		Animal a = mapa.get("zezinho");
		System.out.println(a.getEspecie());
		
	}
	
}







