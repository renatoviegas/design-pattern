package br.com.alura.observer;

import br.com.alura.builder.NotaFiscal;

public class SalvarNotaNoBanco implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvando nota no banco...");		
	}

}
