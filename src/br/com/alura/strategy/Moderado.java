package br.com.alura.strategy;

import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	@Override
	public double calcula(Conta conta) {

		double rendimento = 0;

		if (random.nextInt(2) == 0)
			rendimento = conta.getSaldo() * 0.025;
		else
			rendimento = conta.getSaldo() * 0.007;

		return rendimento;
	}

}
