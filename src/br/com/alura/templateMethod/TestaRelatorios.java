package br.com.alura.templateMethod;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.strategy.Conta;

public class TestaRelatorios {

	public static void main(String[] args) {

		
		Relatorio rel = new RelatorioSimples();
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta c1 = new Conta("Renato", 98755.44);
		Conta c2 = new Conta("Roberta", 235448.31);
		
		contas.add(c1);
		contas.add(c2);
		
		rel.imprime(contas);
		
	}

}
