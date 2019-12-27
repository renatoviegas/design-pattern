package br.com.alura.observer;

import br.com.alura.builder.NotaFiscal;

public class ImprimirNota implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Imprimindo nota...");		
	}

}
