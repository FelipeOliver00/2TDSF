package br.com.fiap.bean;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome = "TB_PRODUTO")
public class Produto {

	@Coluna(nome = "nm_produto", obrigatorio = true)
	private String nome;
	
	@Coluna(nome = "vl_produto")
	private double preco;
	
	@Coluna(nome = "ds_cor")
	private String cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}