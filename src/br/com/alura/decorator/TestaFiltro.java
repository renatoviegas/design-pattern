package br.com.alura.decorator;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.strategy.Conta;

public class TestaFiltro {

	public static void main(String[] args) {
		
		
		Conta c1 = new Conta("Renato", 550052, "Janeiro");
		Conta c2 = new Conta("Roberta", 356673, "Dezembro");
		Conta c3 = new Conta("João", 99.5, "Fevereiro");
		Conta c4 = new Conta("Maria", 5564.55, "Dezembro");
		Conta c5 = new Conta("José", 12.31, "Outubro");
		Conta c6 = new Conta("Fulano", 1231, "Novembro");
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		contas.add(c4);
		contas.add(c5);
		contas.add(c6);
		
		Filtro filtro = new FiltroMenorQue100Reais(new FiltroMaiorQue500MilReais(new FiltroDataDeAberturaNoMesCorrente())); 
		
 		List<Conta> result = filtro.filtra(contas);
 		
 		result.forEach(conta -> {
 			System.out.println(conta.getTitular() + " - " + conta.getSaldo() + " - " + conta.getMesDeAbertura());
 		});
		
		
	}
}
