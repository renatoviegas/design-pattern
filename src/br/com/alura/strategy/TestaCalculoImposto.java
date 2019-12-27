package br.com.alura.strategy;

public class TestaCalculoImposto {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(100.0);

		CalculadorDeImpostos calculador = new CalculadorDeImpostos();

		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}
