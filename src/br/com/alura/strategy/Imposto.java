package br.com.alura.strategy;

public abstract class Imposto {

	protected final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		this.outroImposto = null;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		return (outroImposto == null ? 0 : outroImposto.calcula(orcamento));
	}

}
