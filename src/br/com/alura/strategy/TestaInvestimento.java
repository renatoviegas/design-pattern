package br.com.alura.strategy;

public class TestaInvestimento {

	public static void main(String[] args) {
		Conta c1 = new Conta(100);
		Conta c2 = new Conta(100);
		Conta c3 = new Conta(100);
		Conservador conservador = new Conservador();
		Moderado moderado = new Moderado();
		Arrojado arrojado = new Arrojado();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		
		realizadorDeInvestimentos.calculaRendimento(c1, conservador);		
		realizadorDeInvestimentos.calculaRendimento(c2, moderado);		
		realizadorDeInvestimentos.calculaRendimento(c3, arrojado);		
	}
	
}
