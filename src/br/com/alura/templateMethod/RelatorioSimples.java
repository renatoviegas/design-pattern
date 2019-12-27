package br.com.alura.templateMethod;

import java.util.List;

import br.com.alura.strategy.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("@CopyRights XYZ!");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		contas.stream().forEach(conta -> {
			System.out.println(conta.getTitular() + " - " + conta.getSaldo());
		});
	}

}
