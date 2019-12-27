package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public class DescontoPorMaisDeQuinhentosReais extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		} else {
			return this.proximo.desconta(orcamento);
		}
	}

}
