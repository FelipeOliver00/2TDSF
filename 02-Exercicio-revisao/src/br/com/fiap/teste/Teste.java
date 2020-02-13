package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.Conta;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;
import br.com.fiap.exception.SaldoInsuficienteException;

public class Teste {

	public static void main(String[] args) {
		
		//Instanciar uma conta corrente e poupança
		ContaCorrente cc = new ContaCorrente(1, 2, 
			Calendar.getInstance(), 100, TipoConta.COMUM);
		
		ContaPoupanca cp = new ContaPoupanca(1, 23, 
			new GregorianCalendar(2001, Calendar.OCTOBER, 25), 200, 1);
		
		//Criar uma lista de conta
		List<Conta> lista = new ArrayList<Conta>();
		//Adicionar 3 contas na lista
		lista.add(cc);
		lista.add(cp);
		lista.add(new ContaCorrente(1, 2, Calendar.getInstance(), 500, TipoConta.ESPECIAL));
		
		//Exibir os saldos da conta
		for (Conta c : lista) {
			System.out.println(c.getSaldo());
			//Verificar se o "c" é um objeto da conta corrente
			if (c instanceof ContaCorrente) {
				//Transformar a conta em conta corrente (cast)
				ContaCorrente c1 = (ContaCorrente) c;
				System.out.println(c1.getTipo());
			}
		}
		
		//Chamar o método retirar
		try {
			cc.retirar(5000);
		}catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	} //main
	
} //classe






