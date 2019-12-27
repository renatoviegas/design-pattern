package br.com.alura.templateMethod;

import br.com.alura.strategy.CalculadorDeImpostos;
import br.com.alura.strategy.Item;
import br.com.alura.strategy.Orcamento;

public class TestaTemplateMethod {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(100);
		
		Item i1 = new Item("RELOGIO", 45.0);
		Item i2 = new Item("TELEVISAO", 50.0);
		Item i3 = new Item("RELOGIO", 5.0);
				
		orcamento.adicionaItem(i1);
		orcamento.adicionaItem(i2);
		orcamento.adicionaItem(i3);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		//ICPP x = new ICPP(); 
		//IKCV y = new IKCV();
		IHIT z = new IHIT();
		
		// calculador.realizaCalculo(orcamento, x);
		//calculador.realizaCalculo(orcamento, y);		
		calculador.realizaCalculo(orcamento, z);		
	}

}
