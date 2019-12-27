package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Conta;

public interface Resposta {
	
	void responde(Requisicao req, Conta conta);
	
}
