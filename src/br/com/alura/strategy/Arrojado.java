package br.com.alura.strategy;

import java.util.Random;

public class Arrojado implements Investimento {

	private Random random;
	
	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public double calcula(Conta conta) {
		double rendimento = 0;
		
		int opcao = random.nextInt(10);
		
		System.out.println(opcao);
		
		if (opcao > 4) {
			rendimento = conta.getSaldo() * 0.006; 
		} else if (opcao > 1) {
			rendimento = conta.getSaldo() * 0.03; 			
		} else {
			rendimento = conta.getSaldo() * 0.05; 						
		}
		
		return rendimento;
	}

}
