package br.com.alura.templateMethod;

import java.util.List;

import br.com.alura.strategy.Conta;

abstract class Relatorio {

	public void imprime(List<Conta> contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

	protected abstract void cabecalho();

	protected abstract void corpo(List<Conta> contas);

	protected abstract void rodape();

}
