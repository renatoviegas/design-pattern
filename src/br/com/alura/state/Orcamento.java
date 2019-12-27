package br.com.alura.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.strategy.Item;

public class Orcamento {

	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;
	
	private List<Item> itens = new ArrayList<Item>();

	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
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

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
