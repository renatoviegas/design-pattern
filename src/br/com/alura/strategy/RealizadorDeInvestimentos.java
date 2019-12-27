package br.com.alura.strategy;

public class RealizadorDeInvestimentos {

	public void calculaRendimento(Conta conta, Investimento investimento) {
		double rendimento = investimento.calcula(conta);		
		
		System.out.println("Rendimento: " + rendimento);
		
		conta.deposita(rendimento * 0.75);
		
		System.out.println("Saldo: " + conta.getSaldo());
		
	}
	
}
