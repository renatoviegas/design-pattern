package br.com.alura.state;

public class EmAprovacao implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (this.descontoAplicado) throw new RuntimeException("Desconto já aplicado!");		
		orcamento.valor -= orcamento.valor * 0.05;
		this.descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento em aprovação não pode ser finalizado diretamente!");
	}

}
