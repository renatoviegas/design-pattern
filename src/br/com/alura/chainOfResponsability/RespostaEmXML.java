package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Conta;

public class RespostaEmXML implements Resposta {

	private Resposta resposta;
		
	public RespostaEmXML(Resposta resposta) {
		this.resposta = resposta;
	}	

	public void responde(Requisicao req, Conta conta) {
		
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		} else {
			resposta.responde(req, conta);
		}
		
	}

}
