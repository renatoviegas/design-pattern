package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Orcamento;

public class CalculadorDeDescontos {

	public double calcula(Orcamento orcamento) {
		Descontavel d1 = new DescontoPorMaisDeCincoItens();
		Descontavel d2 = new DescontoPorMaisDeQuinhentosReais();
		Descontavel d3 = new DescontoPorVendaCasada();
		Descontavel d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
	}
	
}
