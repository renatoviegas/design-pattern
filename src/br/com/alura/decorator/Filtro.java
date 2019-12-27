package br.com.alura.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.strategy.Conta;

abstract class Filtro {

	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public Filtro() {
	}

	protected final List<Conta> filtra(List<Conta> contas) {
		
		List<Conta> filtrada = new ArrayList<Conta>();
		
		filtrada.addAll(filtragem(contas));
		
		filtrada.addAll(proximo(contas));
		
		return filtrada;
	}
		
	
	public abstract List<Conta> filtragem(List<Conta> contas);	
	
	protected List<Conta> proximo(List<Conta> contas) {
		if (outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return new ArrayList<Conta>();
	}
}
