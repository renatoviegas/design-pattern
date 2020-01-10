package br.com.alura.visitor;

public interface Visitor {

	void visitaSubtracao(Subtracao subtracao);
	void visitaSoma(Soma soma);
	void visitaNumero(Numero numero);
	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);
	void visitaDivisao(Divisao divisao);
	void visitaMultiplicacao(Multiplicacao multiplicacao);

}
