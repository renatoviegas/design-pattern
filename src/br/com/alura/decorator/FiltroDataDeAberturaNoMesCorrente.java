package br.com.alura.decorator;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.strategy.Conta;

public class FiltroDataDeAberturaNoMesCorrente extends Filtro {

	public FiltroDataDeAberturaNoMesCorrente() {
		// TODO Auto-generated constructor stub
	}

	public FiltroDataDeAberturaNoMesCorrente(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	@Override
	public List<Conta> filtragem(List<Conta> contas) {
		return contas.stream().filter(conta -> (conta.getMesDeAbertura() == "Dezembro")).collect(Collectors.toList());
	}

}
