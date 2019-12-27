package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Conta;

public class TestaRequisicaoWeb {

	public static void main(String[] args) {

		
		Conta conta = new Conta("Renato", 500.0);
		
		Requisicao req = new Requisicao(Formato.PORCENTO);
		
		Resposta r1 = new RespostaEmXML(new RespostaEmCSV(new RespostaEmPorcento(null)));
				
		r1.responde(req, conta);
	}

}
