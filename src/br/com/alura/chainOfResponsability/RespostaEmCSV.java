package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Conta;

public class RespostaEmCSV implements Resposta {

	private Resposta resposta;
	
	public RespostaEmCSV(Resposta resposta) {
		this.resposta = resposta;
	}

	public void responde(Requisicao req, Conta conta) {

		if (req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}

	}

}
