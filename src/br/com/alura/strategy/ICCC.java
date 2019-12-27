package br.com.alura.strategy;

public class ICCC extends Imposto {

	public ICCC() {
	}
	
	@Override
	public double calcula(Orcamento orcamento) {

		double valor = orcamento.getValor();

		if (valor < 1000) {
			valor *= 0.05;
		} else if (valor < 3000) {
			valor *= 0.07;
		} else {
			valor = (valor * 0.08) + 30.0;
		}

		return valor;
	}

}
