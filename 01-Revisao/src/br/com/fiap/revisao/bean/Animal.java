package br.com.fiap.revisao.bean;


/** 
 * Classe abstrata -> n�o pode ser instanciada  
 * pode implementar m�todos abstratos (sem implementa��o)
 *
 */
public abstract class Animal {

	/**
	 * Modificadores de acesso:
	 * public -> todos
	 * private -> s� a classe
	 * protected -> classe no mesmo pacote, heran�a
	 * default/package -> classe no mesmo pacote 
	 */
	
	//Construtor
	public Animal(String especie) {
		this.especie = especie;
	}
	
	private String especie;
	
	private int patas;
	
	private Sexo sexo;
	
	//m�todo abstrato
	public abstract void comer();
	
	public void correr() {
		
	}
	
	//Polimorfismo -> v�rias formas (sobrecarga e sobrescrita)
	//Sobrecarga -> m�todos iguais, par�metros diferentes
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











