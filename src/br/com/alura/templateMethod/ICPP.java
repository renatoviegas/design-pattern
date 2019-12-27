package br.com.alura.templateMethod;

import br.com.alura.strategy.Imposto;
import br.com.alura.strategy.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP() {
	}
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
		
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() >= 500;
	}

	@Override
	public double maximaTaxaca(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
