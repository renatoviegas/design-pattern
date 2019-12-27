package br.com.alura.decorator;

import br.com.alura.strategy.Imposto;
import br.com.alura.strategy.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto() {
	}

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
