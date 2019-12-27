package br.com.alura.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.strategy.Conta;

public class FiltroMaiorQue500MilReais extends Filtro {

	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	@Override
	public List<Conta> filtragem(List<Conta> contas) {
		return contas.stream().filter(conta -> (conta.getSaldo() > 500000)).collect(Collectors.toList());
	}


}
