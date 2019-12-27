package br.com.alura.observer;

import br.com.alura.builder.NotaFiscal;

public class EnviarNotaPorSms implements AcoesAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviando nota por sms...");
	}

}
