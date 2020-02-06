package br.com.fiap.revisao.bean;


/** 
 * Classe abstrata -> não pode ser instanciada  
 * pode implementar métodos abstratos (sem implementação)
 *
 */
public abstract class Animal {

	/**
	 * Modificadores de acesso:
	 * public -> todos
	 * private -> só a classe
	 * protected -> classe no mesmo pacote, herança
	 * default/package -> classe no mesmo pacote 
	 */
	
	//Construtor
	public Animal(String especie) {
		this.especie = especie;
	}
	
	private String especie;
	
	private int patas;
	
	private Sexo sexo;
	
	//método abstrato
	public abstract void comer();
	
	public void correr() {
		
	}
	
	//Polimorfismo -> várias formas (sobrecarga e sobrescrita)
	//Sobrecarga -> métodos iguais, parâmetros diferentes
	public void correr(float velocidade) {
		
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}	
	
}











