package br.com.alura.observer;

import br.com.alura.builder.NotaFiscal;

public class Multiplicador implements AcoesAposGerarNota {
	
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Valor da Nota * fator = " + nf.getValorBruto() + " * " + fator + " = " + (nf.getValorBruto() * fator));
	}

}
