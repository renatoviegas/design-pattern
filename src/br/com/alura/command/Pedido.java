package br.com.alura.command;

import java.time.LocalDate;

public class Pedido {

	private Cliente cliente;
	private double valor;
	private Status status;
	private LocalDate dataDeFinalizacao;

	public Pedido(Cliente cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.status = Status.NOVO;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public Status getStatus() {
		return status;
	}

	public LocalDate getDataDeFinalizacao() {
		return dataDeFinalizacao;
	}

	public void paga() {
		System.out.println("Pedido do cliente: " + cliente.getNome() + " - PAGO");
		this.status = Status.PAGO;
	}
	
	public void finaliza() {
		System.out.println("Pedido do cliente: " + cliente.getNome() + " - FINALIZADO");		
		this.status = Status.ENTREGUE;
	}
}
