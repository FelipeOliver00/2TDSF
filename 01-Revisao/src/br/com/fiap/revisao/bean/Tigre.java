package br.com.fiap.revisao.bean;

public class Tigre extends Animal {

	//Construtor
	public Tigre(String especie) {
		super(especie);
	}
	
	//sobrescrita -> mudamos o comportamento do m�todo na classe filha  
	@Override
	public void correr() {
		
	}

	@Override
	public void comer() {
		
	}
	
}