package br.com.alura.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	protected double valor;
	private List<Item> itens = new ArrayList<Item>();

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public boolean contemItemDeNome(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}
}
