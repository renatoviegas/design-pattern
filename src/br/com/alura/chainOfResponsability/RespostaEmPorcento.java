package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Conta;

public class RespostaEmPorcento implements Resposta {

	private Resposta resposta;

	public RespostaEmPorcento() {
		this.resposta = null;
	}

	public RespostaEmPorcento(Resposta resposta) {
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {

		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else if (resposta != null) {
			resposta.responde(req, conta);
		} 

	}

}
