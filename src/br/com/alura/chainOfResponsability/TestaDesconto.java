package br.com.alura.chainOfResponsability;

import br.com.alura.strategy.Item;
import br.com.alura.strategy.Orcamento;

public class TestaDesconto {

	public static void main(String[] args) {

		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 250.0));
		orcamento.adicionaItem(new Item("LAPIS", 250.0));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);		
	}

}
