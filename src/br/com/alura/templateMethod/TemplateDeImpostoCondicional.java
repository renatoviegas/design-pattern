package br.com.alura.templateMethod;

import br.com.alura.strategy.Imposto;
import br.com.alura.strategy.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public TemplateDeImpostoCondicional() {
	}

	@Override
	public final double calcula(Orcamento orcamento) {

		double valorImposto = 0.0;
		
		if (deveUsarMaximaTaxacao(orcamento)) {
			valorImposto = maximaTaxaca(orcamento);
		} else {
			valorImposto = minimaTaxacao(orcamento);
		}
		
		return valorImposto + calculoDoOutroImposto(orcamento);

	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxaca(Orcamento orcamento);

	protected abstract double minimaTaxacao(Orcamento orcamento);
}
