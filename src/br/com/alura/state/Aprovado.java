package br.com.alura.state;

public class Aprovado implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (this.descontoAplicado) throw new RuntimeException("Desconto j� aplicado!");		
		orcamento.valor -= orcamento.valor * 0.02;
		this.descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Este or�amento j� est� aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aprovado n�o pode ser reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
