package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public class DescontoPorVendaCasada extends Desconto {

	@Override
	public double desconta(Orcamento orcamento) {

		if (aconteceuVendaCasadaEm(orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return orcamento.contemItemDeNome("LAPIS") && orcamento.contemItemDeNome("CANETA");
	}

}
