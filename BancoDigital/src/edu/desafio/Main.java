package edu.desafio;

import edu.desafio.banco.Conta;
import edu.desafio.banco.ContaCorrente;
import edu.desafio.banco.ContaPoupanca;
import edu.desafio.cliente.Cliente;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		cc.depositar(2.0);
		cc.transferir(50.0, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc.depositar(700);
		cc.imprimirExtrato();
	}

}
