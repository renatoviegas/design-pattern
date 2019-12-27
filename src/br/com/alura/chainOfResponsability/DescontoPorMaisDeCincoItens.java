package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public class DescontoPorMaisDeCincoItens extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		} else {
			return this.proximo.desconta(orcamento);
		}

	}

}
