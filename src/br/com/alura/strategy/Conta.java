package br.com.alura.strategy;

public class Conta {

	private double saldo;
	private String titular;
	private String mesDeAbertura;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}	
	
	public Conta(String titular, double saldo, String mesDeAbertura) {
		this.titular = titular;
		this.saldo = saldo;
		this.mesDeAbertura = mesDeAbertura;		
	}	
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public String getTitular() {
		return titular;
	}

	public String getMesDeAbertura() {
		return this.mesDeAbertura;
	}
}
