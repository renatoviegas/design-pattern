package br.com.alura.command;

public class PagaPedido implements Comando {

	private Pedido pedido;

	public PagaPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		this.pedido.paga();
	}

}
