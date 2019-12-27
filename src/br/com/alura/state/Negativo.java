package br.com.alura.state;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta com saldo negativo!");		
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;		
		if (conta.saldo > 0) conta.estado = new Positivo();
	}

}
