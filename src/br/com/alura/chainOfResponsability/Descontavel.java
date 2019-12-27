package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public interface Descontavel {

	double desconta(Orcamento orcamento);
	void setProximo(Descontavel proximo);
	
}
