package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public class SemDesconto implements Descontavel {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Descontavel proximo) {	
	}

}
