package br.com.alura.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.strategy.Conta;

public class FiltroMenorQue100Reais extends Filtro {

	public FiltroMenorQue100Reais() {
		super();
	}

	public FiltroMenorQue100Reais(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	@Override
	public List<Conta> filtragem(List<Conta> contas) {
		return contas.stream().filter(conta -> (conta.getSaldo() < 100)).collect(Collectors.toList());
	}
	
	

}
