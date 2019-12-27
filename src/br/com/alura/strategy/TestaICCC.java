package br.com.alura.strategy;

public class TestaICCC {

	public static void main(String[] args) {

		ICCC iccc = new ICCC();
		
		Orcamento o1 = new Orcamento(500.0);
		Orcamento o2 = new Orcamento(1000.0);
		Orcamento o3 = new Orcamento(3001.0);
		
		CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
		
		calculadorDeImpostos.realizaCalculo(o1, iccc);
		calculadorDeImpostos.realizaCalculo(o2, iccc);
		calculadorDeImpostos.realizaCalculo(o3, iccc);		
	}

}
