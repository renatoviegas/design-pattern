package br.com.alura.memento;

import java.time.LocalDate;

public class Contrato {

	private LocalDate data;
	private String cliente;
	private TipoContrato tipo;

	public Contrato(LocalDate data, String cliente, TipoContrato tipo) {
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public String getCliente() {
		return cliente;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void avanca() {
		if (tipo == TipoContrato.NOVO)
			tipo = TipoContrato.EM_ANDAMENTO;
		else if (tipo == TipoContrato.EM_ANDAMENTO)
			tipo = TipoContrato.ACERTADO;
		else if (tipo == TipoContrato.ACERTADO)
			tipo = TipoContrato.CONCLUIDO;
		
		System.out.println("Estado => " + tipo);
	}

	public Estado salvaEstado() {
		return new Estado(new Contrato(data, cliente, tipo));
	}

	public void restaura(Estado estado) {
		this.data = estado.getContrato().getData();
		this.cliente = estado.getContrato().getCliente();
		this.tipo = estado.getContrato().getTipo();
		System.out.println("Restaurou para => " + this.tipo);
	}

}
