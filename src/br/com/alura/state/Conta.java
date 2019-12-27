package br.com.alura.state;

public class Conta {

	protected double saldo;
	private String titular;
	private String mesDeAbertura;
	protected EstadoDaConta estado;

	public Conta(double saldo) {
		this.saldo = saldo;
		atribuirEstadoAtual();
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		atribuirEstadoAtual();
	}

	public Conta(String titular, double saldo, String mesDeAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.mesDeAbertura = mesDeAbertura;
		atribuirEstadoAtual();
	}

	private void atribuirEstadoAtual() {
		if (this.saldo < 0)
			this.estado = new Negativo();
		else
			this.estado = new Positivo();
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);	
	}

	public String getTitular() {
		return titular;
	}

	public String getMesDeAbertura() {
		return this.mesDeAbertura;
	}
	
	public void saque(double valor) {
		estado.saca(this, valor);
	}
}
