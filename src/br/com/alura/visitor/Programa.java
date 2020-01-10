package br.com.alura.visitor;

public class Programa {

	public static void main(String[] args) {

		Expressao esquerda = new Subtracao(new Soma(new Numero(5), new Numero(7)), new Numero(5));
		Expressao direita = new Soma(new Multiplicacao(new Numero(2), new Numero(10)), new Divisao(new Numero(6), new Numero(3)));
		Expressao soma = new Soma(esquerda, direita);

		int resultado = soma.avalia();

		System.out.println(resultado);
		
		PreFixaVisitor impressora = new PreFixaVisitor();
		soma.aceita(impressora);		
	}

}
